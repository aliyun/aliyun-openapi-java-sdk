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

package com.aliyuncs.nlp_automl.transform.v20191111;

import com.aliyuncs.nlp_automl.model.v20191111.CreateDatasetResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDatasetResponseUnmarshaller {

	public static CreateDatasetResponse unmarshall(CreateDatasetResponse createDatasetResponse, UnmarshallerContext _ctx) {
		
		createDatasetResponse.setRequestId(_ctx.stringValue("CreateDatasetResponse.RequestId"));
		createDatasetResponse.setDatasetId(_ctx.mapValue("CreateDatasetResponse.DatasetId"));
		createDatasetResponse.setCode(_ctx.integerValue("CreateDatasetResponse.Code"));
		createDatasetResponse.setMessage(_ctx.stringValue("CreateDatasetResponse.Message"));
		createDatasetResponse.setSuccess(_ctx.booleanValue("CreateDatasetResponse.Success"));
	 
	 	return createDatasetResponse;
	}
}