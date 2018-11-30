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

package com.aliyuncs.vod.transform.v20170321;

import com.aliyuncs.vod.model.v20170321.GetVodTemplateResponse;
import com.aliyuncs.vod.model.v20170321.GetVodTemplateResponse.VodTemplateInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetVodTemplateResponseUnmarshaller {

	public static GetVodTemplateResponse unmarshall(GetVodTemplateResponse getVodTemplateResponse, UnmarshallerContext context) {
		
		getVodTemplateResponse.setRequestId(context.stringValue("GetVodTemplateResponse.RequestId"));

		VodTemplateInfo vodTemplateInfo = new VodTemplateInfo();
		vodTemplateInfo.setName(context.stringValue("GetVodTemplateResponse.VodTemplateInfo.Name"));
		vodTemplateInfo.setVodTemplateId(context.stringValue("GetVodTemplateResponse.VodTemplateInfo.VodTemplateId"));
		vodTemplateInfo.setTemplateType(context.stringValue("GetVodTemplateResponse.VodTemplateInfo.TemplateType"));
		vodTemplateInfo.setSubTemplateType(context.stringValue("GetVodTemplateResponse.VodTemplateInfo.SubTemplateType"));
		vodTemplateInfo.setSource(context.stringValue("GetVodTemplateResponse.VodTemplateInfo.Source"));
		vodTemplateInfo.setIsDefault(context.stringValue("GetVodTemplateResponse.VodTemplateInfo.IsDefault"));
		vodTemplateInfo.setTemplateConfig(context.stringValue("GetVodTemplateResponse.VodTemplateInfo.TemplateConfig"));
		vodTemplateInfo.setCreationTime(context.stringValue("GetVodTemplateResponse.VodTemplateInfo.CreationTime"));
		vodTemplateInfo.setModifyTime(context.stringValue("GetVodTemplateResponse.VodTemplateInfo.ModifyTime"));
		getVodTemplateResponse.setVodTemplateInfo(vodTemplateInfo);
	 
	 	return getVodTemplateResponse;
	}
}