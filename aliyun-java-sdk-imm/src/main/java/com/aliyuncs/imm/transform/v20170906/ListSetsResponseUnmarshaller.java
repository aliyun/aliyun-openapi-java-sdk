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

import com.aliyuncs.imm.model.v20170906.ListSetsResponse;
import com.aliyuncs.imm.model.v20170906.ListSetsResponse.SetsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListSetsResponseUnmarshaller {

	public static ListSetsResponse unmarshall(ListSetsResponse listSetsResponse, UnmarshallerContext _ctx) {
		
		listSetsResponse.setRequestId(_ctx.stringValue("ListSetsResponse.RequestId"));
		listSetsResponse.setNextMarker(_ctx.stringValue("ListSetsResponse.NextMarker"));

		List<SetsItem> sets = new ArrayList<SetsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListSetsResponse.Sets.Length"); i++) {
			SetsItem setsItem = new SetsItem();
			setsItem.setSetId(_ctx.stringValue("ListSetsResponse.Sets["+ i +"].SetId"));
			setsItem.setSetName(_ctx.stringValue("ListSetsResponse.Sets["+ i +"].SetName"));
			setsItem.setCreateTime(_ctx.stringValue("ListSetsResponse.Sets["+ i +"].CreateTime"));
			setsItem.setModifyTime(_ctx.stringValue("ListSetsResponse.Sets["+ i +"].ModifyTime"));
			setsItem.setFaceCount(_ctx.integerValue("ListSetsResponse.Sets["+ i +"].FaceCount"));
			setsItem.setImageCount(_ctx.integerValue("ListSetsResponse.Sets["+ i +"].ImageCount"));
			setsItem.setVideoCount(_ctx.integerValue("ListSetsResponse.Sets["+ i +"].VideoCount"));
			setsItem.setVideoLength(_ctx.integerValue("ListSetsResponse.Sets["+ i +"].VideoLength"));

			sets.add(setsItem);
		}
		listSetsResponse.setSets(sets);
	 
	 	return listSetsResponse;
	}
}