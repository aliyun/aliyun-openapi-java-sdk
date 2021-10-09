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

package com.aliyuncs.mindlive.transform.v20210301;

import com.aliyuncs.mindlive.model.v20210301.UpdateCurrentItemResponse;
import com.aliyuncs.mindlive.model.v20210301.UpdateCurrentItemResponse.Data;
import com.aliyuncs.mindlive.model.v20210301.UpdateCurrentItemResponse.Data.ItemBackground;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateCurrentItemResponseUnmarshaller {

	public static UpdateCurrentItemResponse unmarshall(UpdateCurrentItemResponse updateCurrentItemResponse, UnmarshallerContext _ctx) {
		
		updateCurrentItemResponse.setRequestId(_ctx.stringValue("UpdateCurrentItemResponse.RequestId"));
		updateCurrentItemResponse.setErrorMessage(_ctx.stringValue("UpdateCurrentItemResponse.ErrorMessage"));
		updateCurrentItemResponse.setSuccess(_ctx.booleanValue("UpdateCurrentItemResponse.Success"));
		updateCurrentItemResponse.setErrorCode(_ctx.stringValue("UpdateCurrentItemResponse.ErrorCode"));

		Data data = new Data();

		ItemBackground itemBackground = new ItemBackground();
		itemBackground.setScope(_ctx.stringValue("UpdateCurrentItemResponse.Data.ItemBackground.Scope"));
		itemBackground.setItemId(_ctx.stringValue("UpdateCurrentItemResponse.Data.ItemBackground.ItemId"));
		itemBackground.setResourceUuid(_ctx.stringValue("UpdateCurrentItemResponse.Data.ItemBackground.ResourceUuid"));
		itemBackground.setDownloadUrl(_ctx.stringValue("UpdateCurrentItemResponse.Data.ItemBackground.DownloadUrl"));
		itemBackground.setFileType(_ctx.stringValue("UpdateCurrentItemResponse.Data.ItemBackground.FileType"));
		data.setItemBackground(itemBackground);
		updateCurrentItemResponse.setData(data);
	 
	 	return updateCurrentItemResponse;
	}
}