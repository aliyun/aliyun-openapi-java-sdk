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

import com.aliyuncs.vcs.model.v20200515.GetBodyOptionsResponse;
import com.aliyuncs.vcs.model.v20200515.GetBodyOptionsResponse.DataItem;
import com.aliyuncs.vcs.model.v20200515.GetBodyOptionsResponse.DataItem.OptionListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetBodyOptionsResponseUnmarshaller {

	public static GetBodyOptionsResponse unmarshall(GetBodyOptionsResponse getBodyOptionsResponse, UnmarshallerContext _ctx) {
		
		getBodyOptionsResponse.setRequestId(_ctx.stringValue("GetBodyOptionsResponse.RequestId"));
		getBodyOptionsResponse.setMessage(_ctx.stringValue("GetBodyOptionsResponse.Message"));
		getBodyOptionsResponse.setCode(_ctx.stringValue("GetBodyOptionsResponse.Code"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetBodyOptionsResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setKey(_ctx.stringValue("GetBodyOptionsResponse.Data["+ i +"].Key"));
			dataItem.setName(_ctx.stringValue("GetBodyOptionsResponse.Data["+ i +"].Name"));

			List<OptionListItem> optionList = new ArrayList<OptionListItem>();
			for (int j = 0; j < _ctx.lengthValue("GetBodyOptionsResponse.Data["+ i +"].OptionList.Length"); j++) {
				OptionListItem optionListItem = new OptionListItem();
				optionListItem.setKey(_ctx.stringValue("GetBodyOptionsResponse.Data["+ i +"].OptionList["+ j +"].Key"));
				optionListItem.setName(_ctx.stringValue("GetBodyOptionsResponse.Data["+ i +"].OptionList["+ j +"].Name"));

				optionList.add(optionListItem);
			}
			dataItem.setOptionList(optionList);

			data.add(dataItem);
		}
		getBodyOptionsResponse.setData(data);
	 
	 	return getBodyOptionsResponse;
	}
}