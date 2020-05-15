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

package com.aliyuncs.sofa.transform.v20190815;

import com.aliyuncs.sofa.model.v20190815.ImportTSJobsOssResponse;
import com.aliyuncs.sofa.model.v20190815.ImportTSJobsOssResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class ImportTSJobsOssResponseUnmarshaller {

	public static ImportTSJobsOssResponse unmarshall(ImportTSJobsOssResponse importTSJobsOssResponse, UnmarshallerContext _ctx) {
		
		importTSJobsOssResponse.setRequestId(_ctx.stringValue("ImportTSJobsOssResponse.RequestId"));
		importTSJobsOssResponse.setResultCode(_ctx.stringValue("ImportTSJobsOssResponse.ResultCode"));
		importTSJobsOssResponse.setResultMessage(_ctx.stringValue("ImportTSJobsOssResponse.ResultMessage"));

		Data data = new Data();
		data.setFailedMap(_ctx.stringValue("ImportTSJobsOssResponse.Data.FailedMap"));
		data.setSucceedCount(_ctx.longValue("ImportTSJobsOssResponse.Data.SucceedCount"));
		importTSJobsOssResponse.setData(data);
	 
	 	return importTSJobsOssResponse;
	}
}