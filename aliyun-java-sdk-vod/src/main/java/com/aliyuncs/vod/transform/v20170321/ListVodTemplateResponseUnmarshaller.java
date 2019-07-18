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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vod.model.v20170321.ListVodTemplateResponse;
import com.aliyuncs.vod.model.v20170321.ListVodTemplateResponse.VodTemplateInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListVodTemplateResponseUnmarshaller {

	public static ListVodTemplateResponse unmarshall(ListVodTemplateResponse listVodTemplateResponse, UnmarshallerContext _ctx) {
		
		listVodTemplateResponse.setRequestId(_ctx.stringValue("ListVodTemplateResponse.RequestId"));

		List<VodTemplateInfo> vodTemplateInfoList = new ArrayList<VodTemplateInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListVodTemplateResponse.VodTemplateInfoList.Length"); i++) {
			VodTemplateInfo vodTemplateInfo = new VodTemplateInfo();
			vodTemplateInfo.setName(_ctx.stringValue("ListVodTemplateResponse.VodTemplateInfoList["+ i +"].Name"));
			vodTemplateInfo.setVodTemplateId(_ctx.stringValue("ListVodTemplateResponse.VodTemplateInfoList["+ i +"].VodTemplateId"));
			vodTemplateInfo.setTemplateType(_ctx.stringValue("ListVodTemplateResponse.VodTemplateInfoList["+ i +"].TemplateType"));
			vodTemplateInfo.setSubTemplateType(_ctx.stringValue("ListVodTemplateResponse.VodTemplateInfoList["+ i +"].SubTemplateType"));
			vodTemplateInfo.setSource(_ctx.stringValue("ListVodTemplateResponse.VodTemplateInfoList["+ i +"].Source"));
			vodTemplateInfo.setIsDefault(_ctx.stringValue("ListVodTemplateResponse.VodTemplateInfoList["+ i +"].IsDefault"));
			vodTemplateInfo.setTemplateConfig(_ctx.stringValue("ListVodTemplateResponse.VodTemplateInfoList["+ i +"].TemplateConfig"));
			vodTemplateInfo.setCreationTime(_ctx.stringValue("ListVodTemplateResponse.VodTemplateInfoList["+ i +"].CreationTime"));
			vodTemplateInfo.setModifyTime(_ctx.stringValue("ListVodTemplateResponse.VodTemplateInfoList["+ i +"].ModifyTime"));
			vodTemplateInfo.setAppId(_ctx.stringValue("ListVodTemplateResponse.VodTemplateInfoList["+ i +"].AppId"));

			vodTemplateInfoList.add(vodTemplateInfo);
		}
		listVodTemplateResponse.setVodTemplateInfoList(vodTemplateInfoList);
	 
	 	return listVodTemplateResponse;
	}
}