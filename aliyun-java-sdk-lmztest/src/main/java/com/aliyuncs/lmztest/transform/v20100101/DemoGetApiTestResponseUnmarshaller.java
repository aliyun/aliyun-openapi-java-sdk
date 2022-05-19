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

import com.aliyuncs.lmztest.model.v20100101.DemoGetApiTestResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DemoGetApiTestResponseUnmarshaller {

	public static DemoGetApiTestResponse unmarshall(DemoGetApiTestResponse demoGetApiTestResponse, UnmarshallerContext _ctx) {
		
		demoGetApiTestResponse.setId(_ctx.stringValue("DemoGetApiTestResponse.Id"));

		List<Map<Object, Object>> maps = _ctx.listMapValue("DemoGetApiTestResponse.Maps");
		demoGetApiTestResponse.setMaps(maps);

		List<String> stringList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DemoGetApiTestResponse.StringList.Length"); i++) {
			stringList.add(_ctx.stringValue("DemoGetApiTestResponse.StringList["+ i +"]"));
		}
		demoGetApiTestResponse.setStringList(stringList);

		List<Long> longList = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("DemoGetApiTestResponse.LongList.Length"); i++) {
			longList.add(_ctx.longValue("DemoGetApiTestResponse.LongList["+ i +"]"));
		}
		demoGetApiTestResponse.setLongList(longList);
	 
	 	return demoGetApiTestResponse;
	}
}