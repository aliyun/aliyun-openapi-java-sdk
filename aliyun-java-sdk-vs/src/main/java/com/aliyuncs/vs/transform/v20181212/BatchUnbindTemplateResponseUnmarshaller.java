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

package com.aliyuncs.vs.transform.v20181212;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vs.model.v20181212.BatchUnbindTemplateResponse;
import com.aliyuncs.vs.model.v20181212.BatchUnbindTemplateResponse.Binding;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchUnbindTemplateResponseUnmarshaller {

	public static BatchUnbindTemplateResponse unmarshall(BatchUnbindTemplateResponse batchUnbindTemplateResponse, UnmarshallerContext _ctx) {
		
		batchUnbindTemplateResponse.setRequestId(_ctx.stringValue("BatchUnbindTemplateResponse.RequestId"));

		List<Binding> bindings = new ArrayList<Binding>();
		for (int i = 0; i < _ctx.lengthValue("BatchUnbindTemplateResponse.Bindings.Length"); i++) {
			Binding binding = new Binding();
			binding.setTemplateId(_ctx.stringValue("BatchUnbindTemplateResponse.Bindings["+ i +"].TemplateId"));
			binding.setInstanceId(_ctx.stringValue("BatchUnbindTemplateResponse.Bindings["+ i +"].InstanceId"));
			binding.setInstanceType(_ctx.stringValue("BatchUnbindTemplateResponse.Bindings["+ i +"].InstanceType"));
			binding.setError(_ctx.stringValue("BatchUnbindTemplateResponse.Bindings["+ i +"].Error"));

			bindings.add(binding);
		}
		batchUnbindTemplateResponse.setBindings(bindings);
	 
	 	return batchUnbindTemplateResponse;
	}
}