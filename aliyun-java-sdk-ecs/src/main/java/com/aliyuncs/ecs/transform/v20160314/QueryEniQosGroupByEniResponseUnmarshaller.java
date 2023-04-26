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

package com.aliyuncs.ecs.transform.v20160314;

import com.aliyuncs.ecs.model.v20160314.QueryEniQosGroupByEniResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryEniQosGroupByEniResponseUnmarshaller {

	public static QueryEniQosGroupByEniResponse unmarshall(QueryEniQosGroupByEniResponse queryEniQosGroupByEniResponse, UnmarshallerContext _ctx) {
		
		queryEniQosGroupByEniResponse.setRequestId(_ctx.stringValue("QueryEniQosGroupByEniResponse.RequestId"));
		queryEniQosGroupByEniResponse.setQosGroupName(_ctx.stringValue("QueryEniQosGroupByEniResponse.QosGroupName"));
	 
	 	return queryEniQosGroupByEniResponse;
	}
}