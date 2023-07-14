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

import com.aliyuncs.pairecservice.model.v20221213.ListSubCrowdsResponse;
import com.aliyuncs.pairecservice.model.v20221213.ListSubCrowdsResponse.SubCrowdsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSubCrowdsResponseUnmarshaller {

	public static ListSubCrowdsResponse unmarshall(ListSubCrowdsResponse listSubCrowdsResponse, UnmarshallerContext _ctx) {
		
		listSubCrowdsResponse.setRequestId(_ctx.stringValue("ListSubCrowdsResponse.RequestId"));
		listSubCrowdsResponse.setTotalCount(_ctx.longValue("ListSubCrowdsResponse.TotalCount"));

		List<SubCrowdsItem> subCrowds = new ArrayList<SubCrowdsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListSubCrowdsResponse.SubCrowds.Length"); i++) {
			SubCrowdsItem subCrowdsItem = new SubCrowdsItem();
			subCrowdsItem.setSubCrowdId(_ctx.stringValue("ListSubCrowdsResponse.SubCrowds["+ i +"].SubCrowdId"));
			subCrowdsItem.setSource(_ctx.stringValue("ListSubCrowdsResponse.SubCrowds["+ i +"].Source"));
			subCrowdsItem.setUsers(_ctx.stringValue("ListSubCrowdsResponse.SubCrowds["+ i +"].Users"));
			subCrowdsItem.setQuantity(_ctx.integerValue("ListSubCrowdsResponse.SubCrowds["+ i +"].Quantity"));
			subCrowdsItem.setGmtCreateTime(_ctx.stringValue("ListSubCrowdsResponse.SubCrowds["+ i +"].GmtCreateTime"));

			subCrowds.add(subCrowdsItem);
		}
		listSubCrowdsResponse.setSubCrowds(subCrowds);
	 
	 	return listSubCrowdsResponse;
	}
}