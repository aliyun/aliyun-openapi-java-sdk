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

package com.aliyuncs.mopen.transform.v20180211;

import com.aliyuncs.mopen.model.v20180211.MoPenBindIsvResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class MoPenBindIsvResponseUnmarshaller {

	public static MoPenBindIsvResponse unmarshall(MoPenBindIsvResponse moPenBindIsvResponse, UnmarshallerContext context) {
		
		moPenBindIsvResponse.setCode(context.booleanValue("MoPenBindIsvResponse.Code"));
		moPenBindIsvResponse.setMessage(context.stringValue("MoPenBindIsvResponse.Message"));
		moPenBindIsvResponse.setSuccess(context.booleanValue("MoPenBindIsvResponse.Success"));
		moPenBindIsvResponse.setDescription(context.stringValue("MoPenBindIsvResponse.Description"));
	 
	 	return moPenBindIsvResponse;
	}
}