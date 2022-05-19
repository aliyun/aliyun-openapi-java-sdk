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

package com.aliyuncs.lmztest.transform.v20100101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.lmztest.model.v20100101.DemoSixHsfResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DemoSixHsfResponseUnmarshaller {

	public static DemoSixHsfResponse unmarshall(DemoSixHsfResponse demoSixHsfResponse, UnmarshallerContext _ctx) {
		
		demoSixHsfResponse.setId(_ctx.stringValue("DemoSixHsfResponse.Id"));
		demoSixHsfResponse.setName(_ctx.stringValue("DemoSixHsfResponse.Name"));

		List<Map<Object, Object>> infos = _ctx.listMapValue("DemoSixHsfResponse.Infos");
		demoSixHsfResponse.setInfos(infos);
	 
	 	return demoSixHsfResponse;
	}
}