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

	public static DescribeTrailsResponse unmarshall(DescribeTrailsResponse describeTrailsResponse, UnmarshallerContext context) {
		
		describeTrailsResponse.setRequestId(context.stringValue("DescribeTrailsResponse.RequestId"));

		List<TrailListItem> trailList = new ArrayList<TrailListItem>();
		for (int i = 0; i < context.lengthValue("DescribeTrailsResponse.TrailList.Length"); i++) {
			TrailListItem trailListItem = new TrailListItem();
			trailListItem.setName(context.stringValue("DescribeTrailsResponse.TrailList["+ i +"].Name"));
			trailListItem.setHomeRegion(context.stringValue("DescribeTrailsResponse.TrailList["+ i +"].HomeRegion"));
			trailListItem.setRoleName(context.stringValue("DescribeTrailsResponse.TrailList["+ i +"].RoleName"));
			trailListItem.setStatus(context.stringValue("DescribeTrailsResponse.TrailList["+ i +"].Status"));
			trailListItem.setIncludeGlobalServiceEvent(context.stringValue("DescribeTrailsResponse.TrailList["+ i +"].IncludeGlobalServiceEvent"));
			trailListItem.setOssBucketName(context.stringValue("DescribeTrailsResponse.TrailList["+ i +"].OssBucketName"));
			trailListItem.setOssKeyPrefix(context.stringValue("DescribeTrailsResponse.TrailList["+ i +"].OssKeyPrefix"));
			trailListItem.setRegion(context.stringValue("DescribeTrailsResponse.TrailList["+ i +"].Region"));
			trailListItem.setEventRW(context.stringValue("DescribeTrailsResponse.TrailList["+ i +"].EventRW"));
			trailListItem.setType(context.stringValue("DescribeTrailsResponse.TrailList["+ i +"].Type"));
			trailListItem.setSlsWriteRoleArn(context.stringValue("DescribeTrailsResponse.TrailList["+ i +"].SlsWriteRoleArn"));
			trailListItem.setSlsProjectArn(context.stringValue("DescribeTrailsResponse.TrailList["+ i +"].SlsProjectArn"));

			trailList.add(trailListItem);
		}
		describeTrailsResponse.setTrailList(trailList);
	 
	 	return describeTrailsResponse;
	}
}