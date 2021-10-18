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

package com.aliyuncs.oos.transform.v20190601;

import com.aliyuncs.oos.model.v20190601.CreateApplicationResponse;
import com.aliyuncs.oos.model.v20190601.CreateApplicationResponse.Application;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateApplicationResponseUnmarshaller {

	public static CreateApplicationResponse unmarshall(CreateApplicationResponse createApplicationResponse, UnmarshallerContext _ctx) {
		
		createApplicationResponse.setRequestId(_ctx.stringValue("CreateApplicationResponse.RequestId"));

		Application application = new Application();
		application.setName(_ctx.stringValue("CreateApplicationResponse.Application.Name"));
		application.setDescription(_ctx.stringValue("CreateApplicationResponse.Application.Description"));
		application.setCreateDate(_ctx.stringValue("CreateApplicationResponse.Application.CreateDate"));
		application.setUpdateDate(_ctx.stringValue("CreateApplicationResponse.Application.UpdateDate"));
		application.setTags(_ctx.mapValue("CreateApplicationResponse.Application.Tags"));
		createApplicationResponse.setApplication(application);
	 
	 	return createApplicationResponse;
	}
}