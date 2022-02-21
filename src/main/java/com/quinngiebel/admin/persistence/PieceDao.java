package com.quinngiebel.admin.persistence;

import com.quinngiebel.admin.entities.Piece;

public class PieceDao extends GenericDao<Piece> {

    /**
     * Default constructor for a Piece DAO.
     */
    public PieceDao() {
    }

    /**
     * Archives a piece.
     * @param toArchive The piece being archived
     */
    public void archivePiece(Piece toArchive) {
        toArchive.setArchived(true);
        update(toArchive);
    }

    /**
     * Unarchives a piece.
     * @param toArchive The piece being unarchived.
     */
    public void unarchivePiece(Piece toArchive) {
        toArchive.setArchived(false);
        update(toArchive);
    }


}
