package com.laybergu.dslist.entities;

import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_belonging")
public class Belonging {

    @EmbeddedId
    private Id id;

    private Integer position;

    public Belonging() {
    }

    public Belonging(Game game, GameGenre genre, Integer position) {
        id.setGame(game);
        id.setGenre(genre);
        this.position = position;
    }

    public Id getId() {
        return id;
    }

    public void setId(Id id) {
        this.id = id;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    @Embeddable
    public static class Id {

        @ManyToOne
        @JoinColumn(name = "game_id")
        private Game game;

        @ManyToOne
        @JoinColumn(name = "genre_id")
        private GameGenre genre;

        public Id() {
        }

        public Id(Game game, GameGenre genre) {
            this.game = game;
            this.genre = genre;
        }

        public Game getGame() {
            return game;
        }

        public void setGame(Game game) {
            this.game = game;
        }

        public GameGenre getGenre() {
            return genre;
        }

        public void setGenre(GameGenre genre) {
            this.genre = genre;
        }

        @Override
        public int hashCode() {
            return Objects.hash(game, genre);
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Id other = (Id) obj;
            if (game == null) {
                if (other.game != null)
                    return false;
            } else if (!game.equals(other.game))
                return false;
            if (genre == null) {
                if (other.genre != null)
                    return false;
            } else if (!genre.equals(other.genre))
                return false;
            return true;
        }

    }
}
