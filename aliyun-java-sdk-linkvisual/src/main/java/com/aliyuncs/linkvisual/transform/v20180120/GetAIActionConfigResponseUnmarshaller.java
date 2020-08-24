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

package com.aliyuncs.linkvisual.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.linkvisual.model.v20180120.GetAIActionConfigResponse;
import com.aliyuncs.linkvisual.model.v20180120.GetAIActionConfigResponse.Data;
import com.aliyuncs.linkvisual.model.v20180120.GetAIActionConfigResponse.Data.InParamListItem;
import com.aliyuncs.linkvisual.model.v20180120.GetAIActionConfigResponse.Data.OutParamListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetAIActionConfigResponseUnmarshaller {

	public static GetAIActionConfigResponse unmarshall(GetAIActionConfigResponse getAIActionConfigResponse, UnmarshallerContext _ctx) {
		
		getAIActionConfigResponse.setRequestId(_ctx.stringValue("GetAIActionConfigResponse.RequestId"));
		getAIActionConfigResponse.setSuccess(_ctx.booleanValue("GetAIActionConfigResponse.Success"));
		getAIActionConfigResponse.setErrorMessage(_ctx.stringValue("GetAIActionConfigResponse.ErrorMessage"));
		getAIActionConfigResponse.setCode(_ctx.stringValue("GetAIActionConfigResponse.Code"));

		Data data = new Data();
		data.setAlgoAction(_ctx.stringValue("GetAIActionConfigResponse.Data.AlgoAction"));
		data.setDes(_ctx.stringValue("GetAIActionConfigResponse.Data.Des"));
		data.setNeedDevice(_ctx.booleanValue("GetAIActionConfigResponse.Data.NeedDevice"));
		data.setSync(_ctx.stringValue("GetAIActionConfigResponse.Data.Sync"));
		data.setAlgoConfigItems(_ctx.stringValue("GetAIActionConfigResponse.Data.AlgoConfigItems"));

		List<InParamListItem> inParamList = new ArrayList<InParamListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAIActionConfigResponse.Data.InParamList.Length"); i++) {
			InParamListItem inParamListItem = new InParamListItem();
			inParamListItem.setDataType(_ctx.stringValue("GetAIActionConfigResponse.Data.InParamList["+ i +"].DataType"));
			inParamListItem.setNeedConfig(_ctx.booleanValue("GetAIActionConfigResponse.Data.InParamList["+ i +"].NeedConfig"));

			List<String> configItems = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetAIActionConfigResponse.Data.InParamList["+ i +"].ConfigItems.Length"); j++) {
				configItems.add(_ctx.stringValue("GetAIActionConfigResponse.Data.InParamList["+ i +"].ConfigItems["+ j +"]"));
			}
			inParamListItem.setConfigItems(configItems);

			inParamList.add(inParamListItem);
		}
		data.setInParamList(inParamList);

		List<OutParamListItem> outParamList = new ArrayList<OutParamListItem>();
		for (int i = 0; i < _ctx.lengthValue("GetAIActionConfigResponse.Data.OutParamList.Length"); i++) {
			OutParamListItem outParamListItem = new OutParamListItem();
			outParamListItem.setDataType(_ctx.stringValue("GetAIActionConfigResponse.Data.OutParamList["+ i +"].DataType"));
			outParamListItem.setNeedConfig(_ctx.booleanValue("GetAIActionConfigResponse.Data.OutParamList["+ i +"].NeedConfig"));

			List<String> configItems1 = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("GetAIActionConfigResponse.Data.OutParamList["+ i +"].ConfigItems.Length"); j++) {
				configItems1.add(_ctx.stringValue("GetAIActionConfigResponse.Data.OutParamList["+ i +"].ConfigItems["+ j +"]"));
			}
			outParamListItem.setConfigItems1(configItems1);

			outParamList.add(outParamListItem);
		}
		data.setOutParamList(outParamList);
		getAIActionConfigResponse.setData(data);
	 
	 	return getAIActionConfigResponse;
	}
}