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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribePGHbaConfigResponse;
import com.aliyuncs.rds.model.v20140815.DescribePGHbaConfigResponse.HbaItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePGHbaConfigResponseUnmarshaller {

	public static DescribePGHbaConfigResponse unmarshall(DescribePGHbaConfigResponse describePGHbaConfigResponse, UnmarshallerContext _ctx) {
		
		describePGHbaConfigResponse.setRequestId(_ctx.stringValue("DescribePGHbaConfigResponse.RequestId"));
		describePGHbaConfigResponse.setHbaModifyTime(_ctx.stringValue("DescribePGHbaConfigResponse.HbaModifyTime"));
		describePGHbaConfigResponse.setModifyStatusReason(_ctx.stringValue("DescribePGHbaConfigResponse.ModifyStatusReason"));
		describePGHbaConfigResponse.setLastModifyStatus(_ctx.stringValue("DescribePGHbaConfigResponse.LastModifyStatus"));

		List<HbaItem> defaultHbaItems = new ArrayList<HbaItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribePGHbaConfigResponse.DefaultHbaItems.Length"); i++) {
			HbaItem hbaItem = new HbaItem();
			hbaItem.setType(_ctx.stringValue("DescribePGHbaConfigResponse.DefaultHbaItems["+ i +"].Type"));
			hbaItem.setMask(_ctx.stringValue("DescribePGHbaConfigResponse.DefaultHbaItems["+ i +"].Mask"));
			hbaItem.setDatabase(_ctx.stringValue("DescribePGHbaConfigResponse.DefaultHbaItems["+ i +"].Database"));
			hbaItem.setPriorityId(_ctx.integerValue("DescribePGHbaConfigResponse.DefaultHbaItems["+ i +"].PriorityId"));
			hbaItem.setAddress(_ctx.stringValue("DescribePGHbaConfigResponse.DefaultHbaItems["+ i +"].Address"));
			hbaItem.setOption(_ctx.stringValue("DescribePGHbaConfigResponse.DefaultHbaItems["+ i +"].Option"));
			hbaItem.setBizMethod(_ctx.stringValue("DescribePGHbaConfigResponse.DefaultHbaItems["+ i +"].Method"));
			hbaItem.setUser(_ctx.stringValue("DescribePGHbaConfigResponse.DefaultHbaItems["+ i +"].User"));

			defaultHbaItems.add(hbaItem);
		}
		describePGHbaConfigResponse.setDefaultHbaItems(defaultHbaItems);

		List<HbaItem> runningHbaItems = new ArrayList<HbaItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribePGHbaConfigResponse.RunningHbaItems.Length"); i++) {
			HbaItem hbaItem1 = new HbaItem();
			hbaItem1.setType(_ctx.stringValue("DescribePGHbaConfigResponse.RunningHbaItems["+ i +"].Type"));
			hbaItem1.setMask(_ctx.stringValue("DescribePGHbaConfigResponse.RunningHbaItems["+ i +"].Mask"));
			hbaItem1.setDatabase(_ctx.stringValue("DescribePGHbaConfigResponse.RunningHbaItems["+ i +"].Database"));
			hbaItem1.setPriorityId(_ctx.integerValue("DescribePGHbaConfigResponse.RunningHbaItems["+ i +"].PriorityId"));
			hbaItem1.setAddress(_ctx.stringValue("DescribePGHbaConfigResponse.RunningHbaItems["+ i +"].Address"));
			hbaItem1.setOption(_ctx.stringValue("DescribePGHbaConfigResponse.RunningHbaItems["+ i +"].Option"));
			hbaItem1.setBizMethod(_ctx.stringValue("DescribePGHbaConfigResponse.RunningHbaItems["+ i +"].Method"));
			hbaItem1.setUser(_ctx.stringValue("DescribePGHbaConfigResponse.RunningHbaItems["+ i +"].User"));

			runningHbaItems.add(hbaItem1);
		}
		describePGHbaConfigResponse.setRunningHbaItems(runningHbaItems);
	 
	 	return describePGHbaConfigResponse;
	}
}