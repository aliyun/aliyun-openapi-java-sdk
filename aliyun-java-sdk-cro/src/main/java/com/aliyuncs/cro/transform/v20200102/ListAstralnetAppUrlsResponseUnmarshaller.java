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

package com.aliyuncs.cro.transform.v20200102;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cro.model.v20200102.ListAstralnetAppUrlsResponse;
import com.aliyuncs.cro.model.v20200102.ListAstralnetAppUrlsResponse.Data;
import com.aliyuncs.cro.model.v20200102.ListAstralnetAppUrlsResponse.Data.Data1;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAstralnetAppUrlsResponseUnmarshaller {

	public static ListAstralnetAppUrlsResponse unmarshall(ListAstralnetAppUrlsResponse listAstralnetAppUrlsResponse, UnmarshallerContext _ctx) {
		
		listAstralnetAppUrlsResponse.setRequestId(_ctx.stringValue("ListAstralnetAppUrlsResponse.RequestId"));
		listAstralnetAppUrlsResponse.setCode(_ctx.integerValue("ListAstralnetAppUrlsResponse.Code"));
		listAstralnetAppUrlsResponse.setSuccess(_ctx.booleanValue("ListAstralnetAppUrlsResponse.Success"));
		listAstralnetAppUrlsResponse.setMessage(_ctx.stringValue("ListAstralnetAppUrlsResponse.Message"));

		Data data = new Data();
		data.setTotal(_ctx.integerValue("ListAstralnetAppUrlsResponse.Data.Total"));

		List<Data1> item = new ArrayList<Data1>();
		for (int i = 0; i < _ctx.lengthValue("ListAstralnetAppUrlsResponse.Data.Item.Length"); i++) {
			Data1 data1 = new Data1();
			data1.setAppName(_ctx.stringValue("ListAstralnetAppUrlsResponse.Data.Item["+ i +"].AppName"));
			data1.setResponseBody(_ctx.stringValue("ListAstralnetAppUrlsResponse.Data.Item["+ i +"].ResponseBody"));
			data1.setMethodProfile(_ctx.stringValue("ListAstralnetAppUrlsResponse.Data.Item["+ i +"].MethodProfile"));
			data1.setFilePath(_ctx.stringValue("ListAstralnetAppUrlsResponse.Data.Item["+ i +"].FilePath"));
			data1.setHost(_ctx.stringValue("ListAstralnetAppUrlsResponse.Data.Item["+ i +"].Host"));
			data1.setPath(_ctx.stringValue("ListAstralnetAppUrlsResponse.Data.Item["+ i +"].Path"));
			data1.setBizMethod(_ctx.stringValue("ListAstralnetAppUrlsResponse.Data.Item["+ i +"].Method"));
			data1.set_Class(_ctx.stringValue("ListAstralnetAppUrlsResponse.Data.Item["+ i +"].Class"));
			data1.setUrlPath(_ctx.stringValue("ListAstralnetAppUrlsResponse.Data.Item["+ i +"].UrlPath"));
			data1.setParameters(_ctx.stringValue("ListAstralnetAppUrlsResponse.Data.Item["+ i +"].Parameters"));
			data1.setContentType(_ctx.stringValue("ListAstralnetAppUrlsResponse.Data.Item["+ i +"].ContentType"));
			data1.setUrlSuffixes(_ctx.stringValue("ListAstralnetAppUrlsResponse.Data.Item["+ i +"].UrlSuffixes"));

			item.add(data1);
		}
		data.setItem(item);
		listAstralnetAppUrlsResponse.setData(data);
	 
	 	return listAstralnetAppUrlsResponse;
	}
}