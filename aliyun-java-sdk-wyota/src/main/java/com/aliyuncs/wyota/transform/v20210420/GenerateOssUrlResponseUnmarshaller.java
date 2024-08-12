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

package com.aliyuncs.wyota.transform.v20210420;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.wyota.model.v20210420.GenerateOssUrlResponse;
import com.aliyuncs.wyota.model.v20210420.GenerateOssUrlResponse.OssUrlList;
import com.aliyuncs.transform.UnmarshallerContext;


public class GenerateOssUrlResponseUnmarshaller {

	public static GenerateOssUrlResponse unmarshall(GenerateOssUrlResponse generateOssUrlResponse, UnmarshallerContext _ctx) {
		
		generateOssUrlResponse.setRequestId(_ctx.stringValue("GenerateOssUrlResponse.RequestId"));

		List<OssUrlList> data = new ArrayList<OssUrlList>();
		for (int i = 0; i < _ctx.lengthValue("GenerateOssUrlResponse.Data.Length"); i++) {
			OssUrlList ossUrlList = new OssUrlList();
			ossUrlList.setObjectName(_ctx.stringValue("GenerateOssUrlResponse.Data["+ i +"].ObjectName"));
			ossUrlList.setDownloadUrl(_ctx.stringValue("GenerateOssUrlResponse.Data["+ i +"].DownloadUrl"));

			data.add(ossUrlList);
		}
		generateOssUrlResponse.setData(data);
	 
	 	return generateOssUrlResponse;
	}
}