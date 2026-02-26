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

package com.aliyuncs.xrengine.transform.v20221111;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.xrengine.model.v20221111.ListLocationServiceResponse;
import com.aliyuncs.xrengine.model.v20221111.ListLocationServiceResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLocationServiceResponseUnmarshaller {

	public static ListLocationServiceResponse unmarshall(ListLocationServiceResponse listLocationServiceResponse, UnmarshallerContext _ctx) {
		
		listLocationServiceResponse.setRequestId(_ctx.stringValue("ListLocationServiceResponse.RequestId"));
		listLocationServiceResponse.setCurrent(_ctx.integerValue("ListLocationServiceResponse.Current"));
		listLocationServiceResponse.setSize(_ctx.integerValue("ListLocationServiceResponse.Size"));
		listLocationServiceResponse.setTotal(_ctx.integerValue("ListLocationServiceResponse.Total"));
		listLocationServiceResponse.setPages(_ctx.integerValue("ListLocationServiceResponse.Pages"));
		listLocationServiceResponse.setSuccess(_ctx.booleanValue("ListLocationServiceResponse.Success"));
		listLocationServiceResponse.setCode(_ctx.stringValue("ListLocationServiceResponse.Code"));
		listLocationServiceResponse.setMessage(_ctx.stringValue("ListLocationServiceResponse.Message"));
		listLocationServiceResponse.setErrorName(_ctx.stringValue("ListLocationServiceResponse.ErrorName"));
		listLocationServiceResponse.setHttpCode(_ctx.integerValue("ListLocationServiceResponse.HttpCode"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ListLocationServiceResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setId(_ctx.longValue("ListLocationServiceResponse.Data["+ i +"].Id"));
			dataItem.setAppId(_ctx.stringValue("ListLocationServiceResponse.Data["+ i +"].AppId"));
			dataItem.setName(_ctx.stringValue("ListLocationServiceResponse.Data["+ i +"].Name"));
			dataItem.setQps(_ctx.longValue("ListLocationServiceResponse.Data["+ i +"].Qps"));
			dataItem.setStartTime(_ctx.stringValue("ListLocationServiceResponse.Data["+ i +"].StartTime"));
			dataItem.setExpireTime(_ctx.stringValue("ListLocationServiceResponse.Data["+ i +"].ExpireTime"));
			dataItem.setGmtCreate(_ctx.stringValue("ListLocationServiceResponse.Data["+ i +"].GmtCreate"));
			dataItem.setGmtModified(_ctx.stringValue("ListLocationServiceResponse.Data["+ i +"].GmtModified"));
			dataItem.setNote(_ctx.stringValue("ListLocationServiceResponse.Data["+ i +"].Note"));
			dataItem.setSvcState(_ctx.stringValue("ListLocationServiceResponse.Data["+ i +"].SvcState"));
			dataItem.setStatus(_ctx.stringValue("ListLocationServiceResponse.Data["+ i +"].Status"));

			data.add(dataItem);
		}
		listLocationServiceResponse.setData(data);
	 
	 	return listLocationServiceResponse;
	}
}