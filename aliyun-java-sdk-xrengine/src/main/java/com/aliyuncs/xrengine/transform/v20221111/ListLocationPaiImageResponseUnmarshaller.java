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

import com.aliyuncs.xrengine.model.v20221111.ListLocationPaiImageResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListLocationPaiImageResponseUnmarshaller {

	public static ListLocationPaiImageResponse unmarshall(ListLocationPaiImageResponse listLocationPaiImageResponse, UnmarshallerContext _ctx) {
		
		listLocationPaiImageResponse.setRequestId(_ctx.stringValue("ListLocationPaiImageResponse.RequestId"));
		listLocationPaiImageResponse.setData(_ctx.mapValue("ListLocationPaiImageResponse.Data"));
		listLocationPaiImageResponse.setCurrent(_ctx.integerValue("ListLocationPaiImageResponse.Current"));
		listLocationPaiImageResponse.setSize(_ctx.integerValue("ListLocationPaiImageResponse.Size"));
		listLocationPaiImageResponse.setTotal(_ctx.integerValue("ListLocationPaiImageResponse.Total"));
		listLocationPaiImageResponse.setPages(_ctx.integerValue("ListLocationPaiImageResponse.Pages"));
		listLocationPaiImageResponse.setSuccess(_ctx.booleanValue("ListLocationPaiImageResponse.Success"));
		listLocationPaiImageResponse.setCode(_ctx.stringValue("ListLocationPaiImageResponse.Code"));
		listLocationPaiImageResponse.setMessage(_ctx.stringValue("ListLocationPaiImageResponse.Message"));
		listLocationPaiImageResponse.setErrorName(_ctx.stringValue("ListLocationPaiImageResponse.ErrorName"));
		listLocationPaiImageResponse.setHttpCode(_ctx.integerValue("ListLocationPaiImageResponse.HttpCode"));
	 
	 	return listLocationPaiImageResponse;
	}
}