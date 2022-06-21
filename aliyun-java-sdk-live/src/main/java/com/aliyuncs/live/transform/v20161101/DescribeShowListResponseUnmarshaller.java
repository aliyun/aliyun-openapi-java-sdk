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

package com.aliyuncs.live.transform.v20161101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.DescribeShowListResponse;
import com.aliyuncs.live.model.v20161101.DescribeShowListResponse.ShowListInfo;
import com.aliyuncs.live.model.v20161101.DescribeShowListResponse.ShowListInfo.Show;
import com.aliyuncs.live.model.v20161101.DescribeShowListResponse.ShowListInfo.Show.ResourceInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeShowListResponseUnmarshaller {

	public static DescribeShowListResponse unmarshall(DescribeShowListResponse describeShowListResponse, UnmarshallerContext _ctx) {
		
		describeShowListResponse.setRequestId(_ctx.stringValue("DescribeShowListResponse.RequestId"));
		describeShowListResponse.setShowList(_ctx.stringValue("DescribeShowListResponse.ShowList"));

		ShowListInfo showListInfo = new ShowListInfo();
		showListInfo.setShowListRepeatTimes(_ctx.integerValue("DescribeShowListResponse.ShowListInfo.ShowListRepeatTimes"));
		showListInfo.setTotalShowListRepeatTimes(_ctx.integerValue("DescribeShowListResponse.ShowListInfo.TotalShowListRepeatTimes"));
		showListInfo.setHighPriorityShowId(_ctx.stringValue("DescribeShowListResponse.ShowListInfo.HighPriorityShowId"));
		showListInfo.setHighPriorityShowStartTime(_ctx.stringValue("DescribeShowListResponse.ShowListInfo.HighPriorityShowStartTime"));
		showListInfo.setCurrentShowId(_ctx.stringValue("DescribeShowListResponse.ShowListInfo.CurrentShowId"));

		List<Show> showList = new ArrayList<Show>();
		for (int i = 0; i < _ctx.lengthValue("DescribeShowListResponse.ShowListInfo.ShowList.Length"); i++) {
			Show show = new Show();
			show.setShowId(_ctx.stringValue("DescribeShowListResponse.ShowListInfo.ShowList["+ i +"].ShowId"));
			show.setShowName(_ctx.stringValue("DescribeShowListResponse.ShowListInfo.ShowList["+ i +"].ShowName"));
			show.setDuration(_ctx.longValue("DescribeShowListResponse.ShowListInfo.ShowList["+ i +"].Duration"));
			show.setRepeatTimes(_ctx.integerValue("DescribeShowListResponse.ShowListInfo.ShowList["+ i +"].RepeatTimes"));

			ResourceInfo resourceInfo = new ResourceInfo();
			resourceInfo.setResourceId(_ctx.stringValue("DescribeShowListResponse.ShowListInfo.ShowList["+ i +"].ResourceInfo.ResourceId"));
			resourceInfo.setResourceUrl(_ctx.stringValue("DescribeShowListResponse.ShowListInfo.ShowList["+ i +"].ResourceInfo.ResourceUrl"));
			resourceInfo.setResourceType(_ctx.stringValue("DescribeShowListResponse.ShowListInfo.ShowList["+ i +"].ResourceInfo.ResourceType"));
			resourceInfo.setLiveInputType(_ctx.integerValue("DescribeShowListResponse.ShowListInfo.ShowList["+ i +"].ResourceInfo.LiveInputType"));
			show.setResourceInfo(resourceInfo);

			showList.add(show);
		}
		showListInfo.setShowList(showList);
		describeShowListResponse.setShowListInfo(showListInfo);
	 
	 	return describeShowListResponse;
	}
}