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

package com.aliyuncs.copyright.transform.v20190123;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.copyright.model.v20190123.GetItemDetailResponse;
import com.aliyuncs.copyright.model.v20190123.GetItemDetailResponse.Module;
import com.aliyuncs.copyright.model.v20190123.GetItemDetailResponse.Module.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetItemDetailResponseUnmarshaller {

	public static GetItemDetailResponse unmarshall(GetItemDetailResponse getItemDetailResponse, UnmarshallerContext _ctx) {
		
		getItemDetailResponse.setRequestId(_ctx.stringValue("GetItemDetailResponse.RequestId"));
		getItemDetailResponse.setHttpStatusCode(_ctx.integerValue("GetItemDetailResponse.HttpStatusCode"));
		getItemDetailResponse.setDynamicCode(_ctx.stringValue("GetItemDetailResponse.DynamicCode"));
		getItemDetailResponse.setDynamicMessage(_ctx.stringValue("GetItemDetailResponse.DynamicMessage"));
		getItemDetailResponse.setErrorMsg(_ctx.stringValue("GetItemDetailResponse.ErrorMsg"));
		getItemDetailResponse.setErrorCode(_ctx.stringValue("GetItemDetailResponse.ErrorCode"));
		getItemDetailResponse.setSuccess(_ctx.booleanValue("GetItemDetailResponse.Success"));
		getItemDetailResponse.setAllowRetry(_ctx.booleanValue("GetItemDetailResponse.AllowRetry"));
		getItemDetailResponse.setAppName(_ctx.stringValue("GetItemDetailResponse.AppName"));

		List<String> errorArgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetItemDetailResponse.ErrorArgs.Length"); i++) {
			errorArgs.add(_ctx.stringValue("GetItemDetailResponse.ErrorArgs["+ i +"]"));
		}
		getItemDetailResponse.setErrorArgs(errorArgs);

		Module module = new Module();

		Item item = new Item();
		item.setItemId(_ctx.integerValue("GetItemDetailResponse.Module.Item.ItemId"));
		item.setTitle(_ctx.stringValue("GetItemDetailResponse.Module.Item.Title"));
		item.setPicUrl(_ctx.stringValue("GetItemDetailResponse.Module.Item.PicUrl"));
		item.setDescription(_ctx.stringValue("GetItemDetailResponse.Module.Item.Description"));
		item.setLeftNum(_ctx.integerValue("GetItemDetailResponse.Module.Item.LeftNum"));
		item.setTotalNum(_ctx.integerValue("GetItemDetailResponse.Module.Item.TotalNum"));
		module.setItem(item);
		getItemDetailResponse.setModule(module);
	 
	 	return getItemDetailResponse;
	}
}