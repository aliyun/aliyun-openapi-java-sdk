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

package com.aliyuncs.actiontrail.transform.v20171204;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.actiontrail.model.v20171204.DescribeTrailsResponse;
import com.aliyuncs.actiontrail.model.v20171204.DescribeTrailsResponse.TrailListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTrailsResponseUnmarshaller {

	public static DescribeTrailsResponse unmarshall(DescribeTrailsResponse describeTrailsResponse, UnmarshallerContext _ctx) {
		
		describeTrailsResponse.setRequestId(_ctx.stringValue("DescribeTrailsResponse.RequestId"));

		List<TrailListItem> trailList = new ArrayList<TrailListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTrailsResponse.TrailList.Length"); i++) {
			TrailListItem trailListItem = new TrailListItem();
			trailListItem.setName(_ctx.stringValue("DescribeTrailsResponse.TrailList["+ i +"].Name"));
			trailListItem.setHomeRegion(_ctx.stringValue("DescribeTrailsResponse.TrailList["+ i +"].HomeRegion"));
			trailListItem.setRoleName(_ctx.stringValue("DescribeTrailsResponse.TrailList["+ i +"].RoleName"));
			trailListItem.setOssBucketName(_ctx.stringValue("DescribeTrailsResponse.TrailList["+ i +"].OssBucketName"));
			trailListItem.setOssKeyPrefix(_ctx.stringValue("DescribeTrailsResponse.TrailList["+ i +"].OssKeyPrefix"));
			trailListItem.setEventRW(_ctx.stringValue("DescribeTrailsResponse.TrailList["+ i +"].EventRW"));
			trailListItem.setSlsWriteRoleArn(_ctx.stringValue("DescribeTrailsResponse.TrailList["+ i +"].SlsWriteRoleArn"));
			trailListItem.setSlsProjectArn(_ctx.stringValue("DescribeTrailsResponse.TrailList["+ i +"].SlsProjectArn"));
			trailListItem.setStatus(_ctx.stringValue("DescribeTrailsResponse.TrailList["+ i +"].Status"));
			trailListItem.setTrailRegion(_ctx.stringValue("DescribeTrailsResponse.TrailList["+ i +"].TrailRegion"));
			trailListItem.setCreateTime(_ctx.stringValue("DescribeTrailsResponse.TrailList["+ i +"].CreateTime"));
			trailListItem.setUpdateTime(_ctx.stringValue("DescribeTrailsResponse.TrailList["+ i +"].UpdateTime"));
			trailListItem.setStartLoggingTime(_ctx.stringValue("DescribeTrailsResponse.TrailList["+ i +"].StartLoggingTime"));
			trailListItem.setStopLoggingTime(_ctx.stringValue("DescribeTrailsResponse.TrailList["+ i +"].StopLoggingTime"));

			trailList.add(trailListItem);
		}
		describeTrailsResponse.setTrailList(trailList);
	 
	 	return describeTrailsResponse;
	}
}