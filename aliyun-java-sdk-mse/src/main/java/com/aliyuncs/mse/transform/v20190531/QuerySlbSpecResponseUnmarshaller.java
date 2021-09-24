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

package com.aliyuncs.mse.transform.v20190531;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mse.model.v20190531.QuerySlbSpecResponse;
import com.aliyuncs.mse.model.v20190531.QuerySlbSpecResponse.SlbSpecs;
import com.aliyuncs.transform.UnmarshallerContext;


public class QuerySlbSpecResponseUnmarshaller {

	public static QuerySlbSpecResponse unmarshall(QuerySlbSpecResponse querySlbSpecResponse, UnmarshallerContext _ctx) {
		
		querySlbSpecResponse.setRequestId(_ctx.stringValue("QuerySlbSpecResponse.RequestId"));
		querySlbSpecResponse.setHttpStatusCode(_ctx.integerValue("QuerySlbSpecResponse.HttpStatusCode"));
		querySlbSpecResponse.setMessage(_ctx.stringValue("QuerySlbSpecResponse.Message"));
		querySlbSpecResponse.setCode(_ctx.integerValue("QuerySlbSpecResponse.Code"));
		querySlbSpecResponse.setSuccess(_ctx.booleanValue("QuerySlbSpecResponse.Success"));

		List<SlbSpecs> data = new ArrayList<SlbSpecs>();
		for (int i = 0; i < _ctx.lengthValue("QuerySlbSpecResponse.Data.Length"); i++) {
			SlbSpecs slbSpecs = new SlbSpecs();
			slbSpecs.setId(_ctx.integerValue("QuerySlbSpecResponse.Data["+ i +"].Id"));
			slbSpecs.setSpec(_ctx.stringValue("QuerySlbSpecResponse.Data["+ i +"].Spec"));
			slbSpecs.setName(_ctx.stringValue("QuerySlbSpecResponse.Data["+ i +"].Name"));
			slbSpecs.setMaxConnection(_ctx.stringValue("QuerySlbSpecResponse.Data["+ i +"].MaxConnection"));
			slbSpecs.setNewConnectionPerSecond(_ctx.stringValue("QuerySlbSpecResponse.Data["+ i +"].NewConnectionPerSecond"));
			slbSpecs.setQps(_ctx.stringValue("QuerySlbSpecResponse.Data["+ i +"].Qps"));

			data.add(slbSpecs);
		}
		querySlbSpecResponse.setData(data);
	 
	 	return querySlbSpecResponse;
	}
}