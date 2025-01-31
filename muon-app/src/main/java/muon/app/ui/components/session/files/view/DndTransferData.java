package muon.app.ui.components.session.files.view;

import muon.app.common.FileInfo;

import java.io.Serializable;
import java.util.Arrays;

public class DndTransferData implements Serializable {

    private int sessionHashcode;
    private FileInfo[] files;
    private String currentDirectory;
    private int source;
    private TransferAction transferAction = TransferAction.DragDrop;
    private final DndSourceType sourceType;
    public DndTransferData(int sessionHashcode, FileInfo[] files,
                           String currentDirectory, int source, DndSourceType sourceType) {
        this.sessionHashcode = sessionHashcode;
        this.files = files;
        this.currentDirectory = currentDirectory;
        this.source = source;
        this.sourceType = sourceType;
    }

    @Override
    public String toString() {
        return "DndTransferData{" + "sessionHashcode=" + sessionHashcode
                + ", files=" + Arrays.toString(files) + ", currentDirectory='"
                + currentDirectory + '\'' + '}';
    }

    public int getInfo() {
        return sessionHashcode;
    }

    public void setInfo(int info) {
        this.sessionHashcode = info;
    }

    public FileInfo[] getFiles() {
        return files;
    }

    public void setFiles(FileInfo[] files) {
        this.files = files;
    }

    public String getCurrentDirectory() {
        return currentDirectory;
    }

    public void setCurrentDirectory(String currentDirectory) {
        this.currentDirectory = currentDirectory;
    }

    public int getSource() {
        return source;
    }

    public void setSource(int source) {
        this.source = source;
    }

    public TransferAction getTransferAction() {
        return transferAction;
    }

    public void setTransferAction(TransferAction transferAction) {
        this.transferAction = transferAction;
    }

    public DndSourceType getSourceType() {
        return sourceType;
    }

    public enum DndSourceType {
        SSH, SFTP, FTP, LOCAL
    }

    public enum TransferAction {
        DragDrop, Cut, Copy
    }
}
