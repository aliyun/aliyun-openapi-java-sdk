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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.UpdateDWSMetadataLogictablesResponse;
import com.aliyuncs.sofa.model.v20190815.UpdateDWSMetadataLogictablesResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateDWSMetadataLogictablesResponseUnmarshaller {

	public static UpdateDWSMetadataLogictablesResponse unmarshall(UpdateDWSMetadataLogictablesResponse updateDWSMetadataLogictablesResponse, UnmarshallerContext _ctx) {
		
		updateDWSMetadataLogictablesResponse.setRequestId(_ctx.stringValue("UpdateDWSMetadataLogictablesResponse.RequestId"));
		updateDWSMetadataLogictablesResponse.setResultCode(_ctx.stringValue("UpdateDWSMetadataLogictablesResponse.ResultCode"));
		updateDWSMetadataLogictablesResponse.setResultMessage(_ctx.stringValue("UpdateDWSMetadataLogictablesResponse.ResultMessage"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("UpdateDWSMetadataLogictablesResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setKey(_ctx.stringValue("UpdateDWSMetadataLogictablesResponse.Data["+ i +"].Key"));
			dataItem.setValue(_ctx.stringValue("UpdateDWSMetadataLogictablesResponse.Data["+ i +"].Value"));

			data.add(dataItem);
		}
		updateDWSMetadataLogictablesResponse.setData(data);
	 
	 	return updateDWSMetadataLogictablesResponse;
	}
}