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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.GetCheckDetailResponse;
import com.aliyuncs.sas.model.v20181203.GetCheckDetailResponse.AssistInfo;
import com.aliyuncs.sas.model.v20181203.GetCheckDetailResponse.CustomConfigsItem;
import com.aliyuncs.sas.model.v20181203.GetCheckDetailResponse.Description;
import com.aliyuncs.sas.model.v20181203.GetCheckDetailResponse.Solution;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCheckDetailResponseUnmarshaller {

	public static GetCheckDetailResponse unmarshall(GetCheckDetailResponse getCheckDetailResponse, UnmarshallerContext _ctx) {
		
		getCheckDetailResponse.setRequestId(_ctx.stringValue("GetCheckDetailResponse.RequestId"));

		Description description = new Description();
		description.setType(_ctx.stringValue("GetCheckDetailResponse.Description.Type"));
		description.setValue(_ctx.stringValue("GetCheckDetailResponse.Description.Value"));
		description.setLink(_ctx.stringValue("GetCheckDetailResponse.Description.Link"));
		getCheckDetailResponse.setDescription(description);

		Solution solution = new Solution();
		solution.setType(_ctx.stringValue("GetCheckDetailResponse.Solution.Type"));
		solution.setValue(_ctx.stringValue("GetCheckDetailResponse.Solution.Value"));
		solution.setLink(_ctx.stringValue("GetCheckDetailResponse.Solution.Link"));
		getCheckDetailResponse.setSolution(solution);

		AssistInfo assistInfo = new AssistInfo();
		assistInfo.setType(_ctx.stringValue("GetCheckDetailResponse.AssistInfo.Type"));
		assistInfo.setValue(_ctx.stringValue("GetCheckDetailResponse.AssistInfo.Value"));
		assistInfo.setLink(_ctx.stringValue("GetCheckDetailResponse.AssistInfo.Link"));
		getCheckDetailResponse.setAssistInfo(assistInfo);

		List<CustomConfigsItem> customConfigs = new ArrayList<CustomConfigsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetCheckDetailResponse.CustomConfigs.Length"); i++) {
			CustomConfigsItem customConfigsItem = new CustomConfigsItem();
			customConfigsItem.setName(_ctx.stringValue("GetCheckDetailResponse.CustomConfigs["+ i +"].Name"));
			customConfigsItem.setTypeDefine(_ctx.stringValue("GetCheckDetailResponse.CustomConfigs["+ i +"].TypeDefine"));
			customConfigsItem.setDefaultValue(_ctx.stringValue("GetCheckDetailResponse.CustomConfigs["+ i +"].DefaultValue"));
			customConfigsItem.setValue(_ctx.stringValue("GetCheckDetailResponse.CustomConfigs["+ i +"].Value"));
			customConfigsItem.setShowName(_ctx.stringValue("GetCheckDetailResponse.CustomConfigs["+ i +"].ShowName"));

			customConfigs.add(customConfigsItem);
		}
		getCheckDetailResponse.setCustomConfigs(customConfigs);
	 
	 	return getCheckDetailResponse;
	}
}