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

package com.aliyuncs.trademark_inner.transform.v20180801;

import com.aliyuncs.trademark_inner.model.v20180801.ProducePopServiceProduceResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ProducePopServiceProduceResponseUnmarshaller {

	public static ProducePopServiceProduceResponse unmarshall(ProducePopServiceProduceResponse producePopServiceProduceResponse, UnmarshallerContext context) {
		
		producePopServiceProduceResponse.setRequestId(context.stringValue("ProducePopServiceProduceResponse.requestId"));
		producePopServiceProduceResponse.setSuccess(context.booleanValue("ProducePopServiceProduceResponse.success"));
		producePopServiceProduceResponse.setMessage(context.stringValue("ProducePopServiceProduceResponse.message"));
		producePopServiceProduceResponse.setCode(context.stringValue("ProducePopServiceProduceResponse.code"));
		producePopServiceProduceResponse.setData(context.booleanValue("ProducePopServiceProduceResponse.data"));
	 
	 	return producePopServiceProduceResponse;
	}
}