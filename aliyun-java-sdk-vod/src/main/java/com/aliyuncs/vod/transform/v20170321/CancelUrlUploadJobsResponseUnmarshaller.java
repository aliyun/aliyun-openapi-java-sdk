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

import com.aliyuncs.vod.model.v20170321.CancelUrlUploadJobsResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CancelUrlUploadJobsResponseUnmarshaller {

	public static CancelUrlUploadJobsResponse unmarshall(CancelUrlUploadJobsResponse cancelUrlUploadJobsResponse, UnmarshallerContext _ctx) {
		
		cancelUrlUploadJobsResponse.setRequestId(_ctx.stringValue("CancelUrlUploadJobsResponse.RequestId"));

		List<String> canceledJobs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CancelUrlUploadJobsResponse.CanceledJobs.Length"); i++) {
			canceledJobs.add(_ctx.stringValue("CancelUrlUploadJobsResponse.CanceledJobs["+ i +"]"));
		}
		cancelUrlUploadJobsResponse.setCanceledJobs(canceledJobs);

		List<String> nonExists = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CancelUrlUploadJobsResponse.NonExists.Length"); i++) {
			nonExists.add(_ctx.stringValue("CancelUrlUploadJobsResponse.NonExists["+ i +"]"));
		}
		cancelUrlUploadJobsResponse.setNonExists(nonExists);
	 
	 	return cancelUrlUploadJobsResponse;
	}
}