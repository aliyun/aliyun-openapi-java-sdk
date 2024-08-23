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

package com.aliyuncs.governance.transform.v20210120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.governance.model.v20210120.GetAccountFactoryBaselineResponse;
import com.aliyuncs.governance.model.v20210120.GetAccountFactoryBaselineResponse.BaselineItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAccountFactoryBaselineResponseUnmarshaller {

	public static GetAccountFactoryBaselineResponse unmarshall(GetAccountFactoryBaselineResponse getAccountFactoryBaselineResponse, UnmarshallerContext _ctx) {
		
		getAccountFactoryBaselineResponse.setRequestId(_ctx.stringValue("GetAccountFactoryBaselineResponse.RequestId"));
		getAccountFactoryBaselineResponse.setBaselineId(_ctx.stringValue("GetAccountFactoryBaselineResponse.BaselineId"));
		getAccountFactoryBaselineResponse.setBaselineName(_ctx.stringValue("GetAccountFactoryBaselineResponse.BaselineName"));
		getAccountFactoryBaselineResponse.setCreateTime(_ctx.stringValue("GetAccountFactoryBaselineResponse.CreateTime"));
		getAccountFactoryBaselineResponse.setDescription(_ctx.stringValue("GetAccountFactoryBaselineResponse.Description"));
		getAccountFactoryBaselineResponse.setType(_ctx.stringValue("GetAccountFactoryBaselineResponse.Type"));
		getAccountFactoryBaselineResponse.setUpdateTime(_ctx.stringValue("GetAccountFactoryBaselineResponse.UpdateTime"));

		List<BaselineItem> baselineItems = new ArrayList<BaselineItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAccountFactoryBaselineResponse.BaselineItems.Length"); i++) {
			BaselineItem baselineItem = new BaselineItem();
			baselineItem.setConfig(_ctx.stringValue("GetAccountFactoryBaselineResponse.BaselineItems["+ i +"].Config"));
			baselineItem.setName(_ctx.stringValue("GetAccountFactoryBaselineResponse.BaselineItems["+ i +"].Name"));
			baselineItem.setVersion(_ctx.stringValue("GetAccountFactoryBaselineResponse.BaselineItems["+ i +"].Version"));

			baselineItems.add(baselineItem);
		}
		getAccountFactoryBaselineResponse.setBaselineItems(baselineItems);
	 
	 	return getAccountFactoryBaselineResponse;
	}
}