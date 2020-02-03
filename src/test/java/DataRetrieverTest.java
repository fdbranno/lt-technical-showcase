import com.lt.model.Photo;
import com.lt.util.DataRetriever;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class DataRetrieverTest {

    @Test
    public void invalidAlbumIdTest() {
        List<Photo> photos = DataRetriever.getPhotos(-1);
        Assert.assertEquals(photos.size(), 0);
    }

    @Test
    public void albumSizeTest() {
        List<Photo> photos = DataRetriever.getPhotos(1);
        Assert.assertEquals(photos.size(), 50);
    }
}
