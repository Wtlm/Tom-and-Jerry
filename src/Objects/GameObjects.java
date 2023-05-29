package Objects;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import Effect.Animation;
import Effect.FrameImage;
import InterFace.GamePanel;
import InterFace.KeyHandler;

public class GameObjects {
    protected boolean collision, collisionWithBomb, bombCollision, enemyCollision;
    protected float posX, posY;
    protected BufferedImage image1, image2, image3, image4;
    protected FrameImage frame1, frame2, frame3, frame4;

    protected float speed;
    protected float width;
    protected float height;
    protected int count = 1;
    protected String direction;
    protected Animation forward, backward, leftside, rightside;
    protected static Rectangle bound;

    public GamePanel gamePanel;
    public KeyHandler keyCode = new KeyHandler(gamePanel);
    public Bomb bomb;

    public GameObjects() {
    }

    public void setPosX(float posX) {
        this.posX = posX;
    }

    public void setPosY(float posY) {
        this.posY = posY;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getPosX() {
        return posX;
    }

    public float getPosY() {
        return posY;
    }

    public float getWidth() {
        return width;
    }

    public float getHeight() {
        return height;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public boolean getCollision() {
        return collision;
    }

    public void setCollision(boolean collision) {
        this.collision = collision;
    }

    public boolean getCollisionWithBomb() {
        return collisionWithBomb;
    }

    public void setCollisionWithBomb(boolean collisionWithBomb) {
        this.collisionWithBomb = collisionWithBomb;
    }

    public boolean getBombCollision() {
        return bombCollision;
    }

    public void setBombCollision(boolean bombCollision) {
        this.bombCollision = bombCollision;
    }

    public boolean getEnemyCollision() {
        return enemyCollision;
    }

    public void setEnemyCollision(boolean enemyCollision) {
        this.enemyCollision = enemyCollision;
    }

    public Rectangle getBoundForCollision() {
        bound = new Rectangle();
        bound.x = 12;
        bound.y = 23;
        bound.width = 39;
        bound.height = 39;
        return bound;
    }

    public void updateChar() {
    }

    public void draw(Graphics2D g2) {

    }

}
