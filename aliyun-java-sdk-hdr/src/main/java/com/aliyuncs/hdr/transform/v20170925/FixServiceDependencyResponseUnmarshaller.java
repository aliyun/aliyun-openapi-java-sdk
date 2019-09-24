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

package com.aliyuncs.hdr.transform.v20170925;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hdr.model.v20170925.FixServiceDependencyResponse;
import com.aliyuncs.hdr.model.v20170925.FixServiceDependencyResponse.Entry;
import com.aliyuncs.transform.UnmarshallerContext;


public class FixServiceDependencyResponseUnmarshaller {

	public static FixServiceDependencyResponse unmarshall(FixServiceDependencyResponse fixServiceDependencyResponse, UnmarshallerContext _ctx) {
		
		fixServiceDependencyResponse.setRequestId(_ctx.stringValue("FixServiceDependencyResponse.RequestId"));
		fixServiceDependencyResponse.setSuccess(_ctx.booleanValue("FixServiceDependencyResponse.Success"));
		fixServiceDependencyResponse.setCode(_ctx.stringValue("FixServiceDependencyResponse.Code"));
		fixServiceDependencyResponse.setMessage(_ctx.stringValue("FixServiceDependencyResponse.Message"));
		fixServiceDependencyResponse.setStatus(_ctx.booleanValue("FixServiceDependencyResponse.Status"));

		List<Entry> entries = new ArrayList<Entry>();
		for (int i = 0; i < _ctx.lengthValue("FixServiceDependencyResponse.Entries.Length"); i++) {
			Entry entry = new Entry();
			entry.setCheckItem(_ctx.stringValue("FixServiceDependencyResponse.Entries["+ i +"].CheckItem"));
			entry.setInternal(_ctx.booleanValue("FixServiceDependencyResponse.Entries["+ i +"].Internal"));
			entry.setDescription(_ctx.booleanValue("FixServiceDependencyResponse.Entries["+ i +"].Description"));

			entries.add(entry);
		}
		fixServiceDependencyResponse.setEntries(entries);
	 
	 	return fixServiceDependencyResponse;
	}
}