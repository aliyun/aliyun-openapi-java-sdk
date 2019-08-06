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

package com.aliyuncs.imm.transform.v20170906;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.imm.model.v20170906.ListTagSetsResponse;
import com.aliyuncs.imm.model.v20170906.ListTagSetsResponse.SetsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTagSetsResponseUnmarshaller {

	public static ListTagSetsResponse unmarshall(ListTagSetsResponse listTagSetsResponse, UnmarshallerContext _ctx) {
		
		listTagSetsResponse.setRequestId(_ctx.stringValue("ListTagSetsResponse.RequestId"));
		listTagSetsResponse.setNextMarker(_ctx.stringValue("ListTagSetsResponse.NextMarker"));

		List<SetsItem> sets = new ArrayList<SetsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListTagSetsResponse.Sets.Length"); i++) {
			SetsItem setsItem = new SetsItem();
			setsItem.setSetId(_ctx.stringValue("ListTagSetsResponse.Sets["+ i +"].SetId"));
			setsItem.setStatus(_ctx.stringValue("ListTagSetsResponse.Sets["+ i +"].Status"));
			setsItem.setPhotos(_ctx.longValue("ListTagSetsResponse.Sets["+ i +"].Photos"));
			setsItem.setCreateTime(_ctx.stringValue("ListTagSetsResponse.Sets["+ i +"].CreateTime"));
			setsItem.setModifyTime(_ctx.stringValue("ListTagSetsResponse.Sets["+ i +"].ModifyTime"));

			sets.add(setsItem);
		}
		listTagSetsResponse.setSets(sets);
	 
	 	return listTagSetsResponse;
	}
}