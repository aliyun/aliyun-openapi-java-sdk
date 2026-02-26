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

package com.aliyuncs.dt_oc_info.transform.v20220829;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dt_oc_info.model.v20220829.GetOcIcKnowledgePropertyPledgeResponse;
import com.aliyuncs.dt_oc_info.model.v20220829.GetOcIcKnowledgePropertyPledgeResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOcIcKnowledgePropertyPledgeResponseUnmarshaller {

	public static GetOcIcKnowledgePropertyPledgeResponse unmarshall(GetOcIcKnowledgePropertyPledgeResponse getOcIcKnowledgePropertyPledgeResponse, UnmarshallerContext _ctx) {
		
		getOcIcKnowledgePropertyPledgeResponse.setRequestId(_ctx.stringValue("GetOcIcKnowledgePropertyPledgeResponse.RequestId"));
		getOcIcKnowledgePropertyPledgeResponse.setCode(_ctx.stringValue("GetOcIcKnowledgePropertyPledgeResponse.Code"));
		getOcIcKnowledgePropertyPledgeResponse.setSuccess(_ctx.booleanValue("GetOcIcKnowledgePropertyPledgeResponse.Success"));
		getOcIcKnowledgePropertyPledgeResponse.setMessage(_ctx.stringValue("GetOcIcKnowledgePropertyPledgeResponse.Message"));
		getOcIcKnowledgePropertyPledgeResponse.setTotalNum(_ctx.integerValue("GetOcIcKnowledgePropertyPledgeResponse.TotalNum"));
		getOcIcKnowledgePropertyPledgeResponse.setPageIndex(_ctx.integerValue("GetOcIcKnowledgePropertyPledgeResponse.PageIndex"));
		getOcIcKnowledgePropertyPledgeResponse.setPageNum(_ctx.integerValue("GetOcIcKnowledgePropertyPledgeResponse.PageNum"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetOcIcKnowledgePropertyPledgeResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setName(_ctx.stringValue("GetOcIcKnowledgePropertyPledgeResponse.Data["+ i +"].Name"));
			dataItem.setNumber(_ctx.stringValue("GetOcIcKnowledgePropertyPledgeResponse.Data["+ i +"].Number"));
			dataItem.setType(_ctx.stringValue("GetOcIcKnowledgePropertyPledgeResponse.Data["+ i +"].Type"));
			dataItem.setPledgor(_ctx.stringValue("GetOcIcKnowledgePropertyPledgeResponse.Data["+ i +"].Pledgor"));
			dataItem.setPawnee(_ctx.stringValue("GetOcIcKnowledgePropertyPledgeResponse.Data["+ i +"].Pawnee"));
			dataItem.setPeriod(_ctx.stringValue("GetOcIcKnowledgePropertyPledgeResponse.Data["+ i +"].Period"));
			dataItem.setStatus(_ctx.stringValue("GetOcIcKnowledgePropertyPledgeResponse.Data["+ i +"].Status"));
			dataItem.setPublicDate(_ctx.stringValue("GetOcIcKnowledgePropertyPledgeResponse.Data["+ i +"].PublicDate"));

			data.add(dataItem);
		}
		getOcIcKnowledgePropertyPledgeResponse.setData(data);
	 
	 	return getOcIcKnowledgePropertyPledgeResponse;
	}
}