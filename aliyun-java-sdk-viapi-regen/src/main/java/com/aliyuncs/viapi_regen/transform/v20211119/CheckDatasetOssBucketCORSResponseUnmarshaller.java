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

package com.aliyuncs.viapi_regen.transform.v20211119;

import com.aliyuncs.viapi_regen.model.v20211119.CheckDatasetOssBucketCORSResponse;
import com.aliyuncs.viapi_regen.model.v20211119.CheckDatasetOssBucketCORSResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckDatasetOssBucketCORSResponseUnmarshaller {

	public static CheckDatasetOssBucketCORSResponse unmarshall(CheckDatasetOssBucketCORSResponse checkDatasetOssBucketCORSResponse, UnmarshallerContext _ctx) {
		
		checkDatasetOssBucketCORSResponse.setRequestId(_ctx.stringValue("CheckDatasetOssBucketCORSResponse.RequestId"));
		checkDatasetOssBucketCORSResponse.setMessage(_ctx.stringValue("CheckDatasetOssBucketCORSResponse.Message"));
		checkDatasetOssBucketCORSResponse.setCode(_ctx.stringValue("CheckDatasetOssBucketCORSResponse.Code"));

		Data data = new Data();
		data.setSetOssBucketCORSFlag(_ctx.booleanValue("CheckDatasetOssBucketCORSResponse.Data.SetOssBucketCORSFlag"));
		data.setOssBucketCORSConfigUrl(_ctx.stringValue("CheckDatasetOssBucketCORSResponse.Data.OssBucketCORSConfigUrl"));
		data.setBucket(_ctx.stringValue("CheckDatasetOssBucketCORSResponse.Data.Bucket"));
		checkDatasetOssBucketCORSResponse.setData(data);
	 
	 	return checkDatasetOssBucketCORSResponse;
	}
}