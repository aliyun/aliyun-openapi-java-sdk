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

package com.aliyuncs.pairecservice.transform.v20221213;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.pairecservice.model.v20221213.ListCrowdsResponse;
import com.aliyuncs.pairecservice.model.v20221213.ListCrowdsResponse.CrowdsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCrowdsResponseUnmarshaller {

	public static ListCrowdsResponse unmarshall(ListCrowdsResponse listCrowdsResponse, UnmarshallerContext _ctx) {
		
		listCrowdsResponse.setRequestId(_ctx.stringValue("ListCrowdsResponse.RequestId"));
		listCrowdsResponse.setTotalCount(_ctx.longValue("ListCrowdsResponse.TotalCount"));

		List<CrowdsItem> crowds = new ArrayList<CrowdsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListCrowdsResponse.Crowds.Length"); i++) {
			CrowdsItem crowdsItem = new CrowdsItem();
			crowdsItem.setCrowdId(_ctx.stringValue("ListCrowdsResponse.Crowds["+ i +"].CrowdId"));
			crowdsItem.setName(_ctx.stringValue("ListCrowdsResponse.Crowds["+ i +"].Name"));
			crowdsItem.setDescription(_ctx.stringValue("ListCrowdsResponse.Crowds["+ i +"].Description"));
			crowdsItem.setLabel(_ctx.stringValue("ListCrowdsResponse.Crowds["+ i +"].Label"));
			crowdsItem.setSource(_ctx.stringValue("ListCrowdsResponse.Crowds["+ i +"].Source"));
			crowdsItem.setQuantity(_ctx.stringValue("ListCrowdsResponse.Crowds["+ i +"].Quantity"));
			crowdsItem.setUsers(_ctx.stringValue("ListCrowdsResponse.Crowds["+ i +"].Users"));
			crowdsItem.setGmtCreateTime(_ctx.stringValue("ListCrowdsResponse.Crowds["+ i +"].GmtCreateTime"));

			crowds.add(crowdsItem);
		}
		listCrowdsResponse.setCrowds(crowds);
	 
	 	return listCrowdsResponse;
	}
}