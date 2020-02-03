import com.lt.exception.EmptyAlbumException;
import com.lt.model.Photo;
import com.lt.util.DataRetriever;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class DataRetrieverTest {

    @Test
    public void invalidAlbumIdTest() {
        try {
            DataRetriever.getPhotos(-1);
            Assert.fail();
        } catch (EmptyAlbumException e) {
            //Expected behavior
        }
    }

    @Test
    public void albumSizeTest() {
        try {
            List<Photo> photos = DataRetriever.getPhotos(1);
            Assert.assertEquals(photos.size(), 50);
        } catch (EmptyAlbumException e) {
            Assert.fail();
        }
    }
}
