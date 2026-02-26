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

package com.aliyuncs.gpdb.transform.v20160503;

import com.aliyuncs.gpdb.model.v20160503.CreateStreamingDataSourceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateStreamingDataSourceResponseUnmarshaller {

	public static CreateStreamingDataSourceResponse unmarshall(CreateStreamingDataSourceResponse createStreamingDataSourceResponse, UnmarshallerContext _ctx) {
		
		createStreamingDataSourceResponse.setRequestId(_ctx.stringValue("CreateStreamingDataSourceResponse.RequestId"));
		createStreamingDataSourceResponse.setDataSourceId(_ctx.integerValue("CreateStreamingDataSourceResponse.DataSourceId"));
	 
	 	return createStreamingDataSourceResponse;
	}
}