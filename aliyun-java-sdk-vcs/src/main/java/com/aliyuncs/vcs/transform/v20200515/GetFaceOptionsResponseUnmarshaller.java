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

package com.aliyuncs.vcs.transform.v20200515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vcs.model.v20200515.GetFaceOptionsResponse;
import com.aliyuncs.vcs.model.v20200515.GetFaceOptionsResponse.DataItem;
import com.aliyuncs.vcs.model.v20200515.GetFaceOptionsResponse.DataItem.OptionListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetFaceOptionsResponseUnmarshaller {

	public static GetFaceOptionsResponse unmarshall(GetFaceOptionsResponse getFaceOptionsResponse, UnmarshallerContext _ctx) {
		
		getFaceOptionsResponse.setRequestId(_ctx.stringValue("GetFaceOptionsResponse.RequestId"));
		getFaceOptionsResponse.setMessage(_ctx.stringValue("GetFaceOptionsResponse.Message"));
		getFaceOptionsResponse.setCode(_ctx.stringValue("GetFaceOptionsResponse.Code"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetFaceOptionsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setKey(_ctx.stringValue("GetFaceOptionsResponse.Data["+ i +"].Key"));
			dataItem.setName(_ctx.stringValue("GetFaceOptionsResponse.Data["+ i +"].Name"));

			List<OptionListItem> optionList = new ArrayList<OptionListItem>();
			for (int j = 0; j < _ctx.lengthValue("GetFaceOptionsResponse.Data["+ i +"].OptionList.Length"); j++) {
				OptionListItem optionListItem = new OptionListItem();
				optionListItem.setKey(_ctx.stringValue("GetFaceOptionsResponse.Data["+ i +"].OptionList["+ j +"].Key"));
				optionListItem.setName(_ctx.stringValue("GetFaceOptionsResponse.Data["+ i +"].OptionList["+ j +"].Name"));

				optionList.add(optionListItem);
			}
			dataItem.setOptionList(optionList);

			data.add(dataItem);
		}
		getFaceOptionsResponse.setData(data);
	 
	 	return getFaceOptionsResponse;
	}
}