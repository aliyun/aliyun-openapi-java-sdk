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

package com.aliyuncs.actiontrail.transform.v20200706;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.actiontrail.model.v20200706.DescribeTrailsResponse;
import com.aliyuncs.actiontrail.model.v20200706.DescribeTrailsResponse.Trail;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeTrailsResponseUnmarshaller {

	public static DescribeTrailsResponse unmarshall(DescribeTrailsResponse describeTrailsResponse, UnmarshallerContext _ctx) {
		
		describeTrailsResponse.setRequestId(_ctx.stringValue("DescribeTrailsResponse.RequestId"));

		List<Trail> trailList = new ArrayList<Trail>();
		for (int i = 0; i < _ctx.lengthValue("DescribeTrailsResponse.TrailList.Length"); i++) {
			Trail trail = new Trail();
			trail.setStatus(_ctx.stringValue("DescribeTrailsResponse.TrailList["+ i +"].Status"));
			trail.setHomeRegion(_ctx.stringValue("DescribeTrailsResponse.TrailList["+ i +"].HomeRegion"));
			trail.setStartLoggingTime(_ctx.stringValue("DescribeTrailsResponse.TrailList["+ i +"].StartLoggingTime"));
			trail.setCreateTime(_ctx.stringValue("DescribeTrailsResponse.TrailList["+ i +"].CreateTime"));
			trail.setStopLoggingTime(_ctx.stringValue("DescribeTrailsResponse.TrailList["+ i +"].StopLoggingTime"));
			trail.setOrganizationId(_ctx.stringValue("DescribeTrailsResponse.TrailList["+ i +"].OrganizationId"));
			trail.setSlsWriteRoleArn(_ctx.stringValue("DescribeTrailsResponse.TrailList["+ i +"].SlsWriteRoleArn"));
			trail.setOssBucketLocation(_ctx.stringValue("DescribeTrailsResponse.TrailList["+ i +"].OssBucketLocation"));
			trail.setTrailRegion(_ctx.stringValue("DescribeTrailsResponse.TrailList["+ i +"].TrailRegion"));
			trail.setName(_ctx.stringValue("DescribeTrailsResponse.TrailList["+ i +"].Name"));
			trail.setIsOrganizationTrail(_ctx.booleanValue("DescribeTrailsResponse.TrailList["+ i +"].IsOrganizationTrail"));
			trail.setSlsProjectArn(_ctx.stringValue("DescribeTrailsResponse.TrailList["+ i +"].SlsProjectArn"));
			trail.setEventRW(_ctx.stringValue("DescribeTrailsResponse.TrailList["+ i +"].EventRW"));
			trail.setOssKeyPrefix(_ctx.stringValue("DescribeTrailsResponse.TrailList["+ i +"].OssKeyPrefix"));
			trail.setUpdateTime(_ctx.stringValue("DescribeTrailsResponse.TrailList["+ i +"].UpdateTime"));
			trail.setRegion(_ctx.stringValue("DescribeTrailsResponse.TrailList["+ i +"].Region"));
			trail.setOssBucketName(_ctx.stringValue("DescribeTrailsResponse.TrailList["+ i +"].OssBucketName"));
			trail.setOssWriteRoleArn(_ctx.stringValue("DescribeTrailsResponse.TrailList["+ i +"].OssWriteRoleArn"));
			trail.setIsShadowTrail(_ctx.longValue("DescribeTrailsResponse.TrailList["+ i +"].IsShadowTrail"));

			trailList.add(trail);
		}
		describeTrailsResponse.setTrailList(trailList);
	 
	 	return describeTrailsResponse;
	}
}