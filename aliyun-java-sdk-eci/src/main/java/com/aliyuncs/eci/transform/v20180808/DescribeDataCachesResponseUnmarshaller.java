/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.eci.transform.v20180808;

import com.aliyuncs.eci.model.v20180808.DescribeDataCachesResponse;
import com.aliyuncs.eci.model.v20180808.DescribeDataCachesResponse.DataCache;
import com.aliyuncs.eci.model.v20180808.DescribeDataCachesResponse.DataCache.DataSource;
import com.aliyuncs.eci.model.v20180808.DescribeDataCachesResponse.DataCache.Event;
import com.aliyuncs.eci.model.v20180808.DescribeDataCachesResponse.DataCache.Tag;
import com.aliyuncs.transform.UnmarshallerContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xiaohui
 * @version 1.4.0
 */
public class DescribeDataCachesResponseUnmarshaller {

    public static DescribeDataCachesResponse unmarshall(DescribeDataCachesResponse describeDataCachesResponse, UnmarshallerContext context) {

        describeDataCachesResponse.setRequestId(context.stringValue("DescribeDataCachesResponse.RequestId"));
        describeDataCachesResponse.setTotalCount(context.integerValue("DescribeDataCachesResponse.TotalCount"));
        describeDataCachesResponse.setNextToken(context.stringValue("DescribeDataCachesResponse.NextToken"));

        List<DataCache> dataCaches = new ArrayList<DataCache>();
        for (int i = 0; i < context.lengthValue("DescribeDataCachesResponse.DataCaches.Length"); i++) {
            DataCache dataCache = new DataCache();
            dataCache.setDataCacheId(context.stringValue("DescribeDataCachesResponse.DataCaches[" + i + "].DataCacheId"));
            dataCache.setBucket(context.stringValue("DescribeDataCachesResponse.DataCaches[" + i + "].Bucket"));
            dataCache.setCreationTime(context.stringValue("DescribeDataCachesResponse.DataCaches[" + i + "].CreationTime"));
            dataCache.setName(context.stringValue("DescribeDataCachesResponse.DataCaches[" + i + "].Name"));
            dataCache.setContainerGroupId(context.stringValue("DescribeDataCachesResponse.DataCaches[" + i + "].ContainerGroupId"));
            dataCache.setExpireDateTime(context.stringValue("DescribeDataCachesResponse.DataCaches[" + i + "].ExpireDateTime"));
            dataCache.setFlashSnapshotId(context.stringValue("DescribeDataCachesResponse.DataCaches[" + i + "].FlashSnapshotId"));
            dataCache.setProgress(context.stringValue("DescribeDataCachesResponse.DataCaches[" + i + "].Progress"));
            dataCache.setPath(context.stringValue("DescribeDataCachesResponse.DataCaches[" + i + "].Path"));
            dataCache.setLastMatchedTime(context.stringValue("DescribeDataCachesResponse.DataCaches[" + i + "].LastMatchedTime"));
            dataCache.setRegionId(context.stringValue("DescribeDataCachesResponse.DataCaches[" + i + "].RegionId"));
            dataCache.setResourceGroupId(context.stringValue("DescribeDataCachesResponse.DataCaches[" + i + "].ResourceGroupId"));
            dataCache.setSnapshotId(context.stringValue("DescribeDataCachesResponse.DataCaches[" + i + "].SnapshotId"));
            dataCache.setStatus(context.stringValue("DescribeDataCachesResponse.DataCaches[" + i + "].Status"));
            dataCache.setSize(context.integerValue("DescribeDataCachesResponse.DataCaches[" + i + "].Size"));

            List<Tag> tags = new ArrayList<Tag>();
            for (int t = 0; t < context.lengthValue("DescribeDataCachesResponse.DataCaches[" + i + "].Tags.Length"); t++) {
                Tag tag = new Tag();
                tag.setKey(context.stringValue("DescribeDataCachesResponse.DataCaches[" + i + "].Tags[" + t +"].Key"));
                tag.setValue(context.stringValue("DescribeDataCachesResponse.DataCaches[" + i + "].Tags[" + t +"].Value"));
                tags.add(tag);
            }
            dataCache.setTags(tags);

            List<Event> events = new ArrayList<Event>();
            for (int e = 0; e < context.lengthValue("DescribeDataCachesResponse.DataCaches[" + i + "].Events.Length"); e++) {
                Event event = new Event();
                event.setCount(context.integerValue("DescribeDataCachesResponse.DataCaches[" + i + "].Events[" + e + "].Count"));
                event.setFirstTimestamp(context.stringValue("DescribeDataCachesResponse.DataCaches[" + i + "].Events[" + e + "].FirstTimestamp"));
                event.setLastTimestamp(context.stringValue("DescribeDataCachesResponse.DataCaches[" + i + "].Events[" + e + "].LastTimestamp"));
                event.setName(context.stringValue("DescribeDataCachesResponse.DataCaches[" + i + "].Events[" + e + "].Name"));
                event.setType(context.stringValue("DescribeDataCachesResponse.DataCaches[" + i + "].Events[" + e + "].Type"));
                event.setMessage(context.stringValue("DescribeDataCachesResponse.DataCaches[" + i + "].Events[" + e + "].Message"));
                events.add(event);
            }
            dataCache.setEvents(events);

            DataSource dataSource = new DataSource();
            dataSource.setType(context.stringValue("DescribeDataCachesResponse.DataCaches[" + i + "].DataSource.Type"));
            dataSource.setOptions(context.stringValue("DescribeDataCachesResponse.DataCaches[" + i + "].DataSource.Options"));

            dataCache.setDataSource(dataSource);
            dataCaches.add(dataCache);

        }
        describeDataCachesResponse.setDataCaches(dataCaches);

        return describeDataCachesResponse;

    }
}
