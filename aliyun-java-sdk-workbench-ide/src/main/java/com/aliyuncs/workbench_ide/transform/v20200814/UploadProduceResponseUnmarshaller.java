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

package com.aliyuncs.workbench_ide.transform.v20200814;

import com.aliyuncs.workbench_ide.model.v20200814.UploadProduceResponse;
import com.aliyuncs.workbench_ide.model.v20200814.UploadProduceResponse.Data;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class UploadProduceResponseUnmarshaller {

	public static UploadProduceResponse unmarshall(UploadProduceResponse uploadProduceResponse, UnmarshallerContext _ctx) {
		
		uploadProduceResponse.setRequestId(_ctx.stringValue("UploadProduceResponse.RequestId"));
		uploadProduceResponse.setResultNo(_ctx.integerValue("UploadProduceResponse.ResultNo"));
		uploadProduceResponse.setResultMessage(_ctx.stringValue("UploadProduceResponse.ResultMessage"));

		Data data = new Data();
		data.setUploadUrl(_ctx.stringValue("UploadProduceResponse.Data.UploadUrl"));
		data.setFileUrl(_ctx.stringValue("UploadProduceResponse.Data.FileUrl"));
		data.setHeaders(_ctx.mapValue("UploadProduceResponse.Data.Headers"));
		uploadProduceResponse.setData(data);
	 
	 	return uploadProduceResponse;
	}
}