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

package com.aliyuncs.bpstudio.transform.v20210931;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.bpstudio.model.v20210931.GetResource4ModifyRecordResponse;
import com.aliyuncs.bpstudio.model.v20210931.GetResource4ModifyRecordResponse.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetResource4ModifyRecordResponseUnmarshaller {

	public static GetResource4ModifyRecordResponse unmarshall(GetResource4ModifyRecordResponse getResource4ModifyRecordResponse, UnmarshallerContext _ctx) {
		
		getResource4ModifyRecordResponse.setRequestId(_ctx.stringValue("GetResource4ModifyRecordResponse.RequestId"));
		getResource4ModifyRecordResponse.setMessage(_ctx.stringValue("GetResource4ModifyRecordResponse.Message"));
		getResource4ModifyRecordResponse.setCode(_ctx.stringValue("GetResource4ModifyRecordResponse.Code"));
		getResource4ModifyRecordResponse.setTotalCount(_ctx.stringValue("GetResource4ModifyRecordResponse.TotalCount"));
		getResource4ModifyRecordResponse.setNextToken(_ctx.stringValue("GetResource4ModifyRecordResponse.NextToken"));
		getResource4ModifyRecordResponse.setAccessDeniedDetail(_ctx.stringValue("GetResource4ModifyRecordResponse.AccessDeniedDetail"));

		List<Item> data = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("GetResource4ModifyRecordResponse.Data.Length"); i++) {
			Item item = new Item();
			item.setResourceId(_ctx.stringValue("GetResource4ModifyRecordResponse.Data["+ i +"].ResourceId"));
			item.setType(_ctx.stringValue("GetResource4ModifyRecordResponse.Data["+ i +"].Type"));
			item.setStatus(_ctx.stringValue("GetResource4ModifyRecordResponse.Data["+ i +"].Status"));
			item.setModifyTime(_ctx.stringValue("GetResource4ModifyRecordResponse.Data["+ i +"].ModifyTime"));
			item.setAttribute(_ctx.stringValue("GetResource4ModifyRecordResponse.Data["+ i +"].Attribute"));

			data.add(item);
		}
		getResource4ModifyRecordResponse.setData(data);
	 
	 	return getResource4ModifyRecordResponse;
	}
}