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

import com.aliyuncs.lmztest.model.v20100101.DemoSevenHttpResponse;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DemoSevenHttpResponseUnmarshaller {

	public static DemoSevenHttpResponse unmarshall(DemoSevenHttpResponse demoSevenHttpResponse, UnmarshallerContext _ctx) {
		
		demoSevenHttpResponse.setId(_ctx.stringValue("DemoSevenHttpResponse.id"));
		demoSevenHttpResponse.setName(_ctx.stringValue("DemoSevenHttpResponse.name"));
		demoSevenHttpResponse.setCode(_ctx.stringValue("DemoSevenHttpResponse.code"));

		List<Long> longList = new ArrayList<Long>();
		for (int i = 0; i < _ctx.lengthValue("DemoSevenHttpResponse.longList.Length"); i++) {
			longList.add(_ctx.longValue("DemoSevenHttpResponse.longList["+ i +"]"));
		}
		demoSevenHttpResponse.setLongList(longList);

		List<String> stringList = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DemoSevenHttpResponse.stringList.Length"); i++) {
			stringList.add(_ctx.stringValue("DemoSevenHttpResponse.stringList["+ i +"]"));
		}
		demoSevenHttpResponse.setStringList(stringList);

		List<Map<Object, Object>> maps = _ctx.listMapValue("DemoSevenHttpResponse.maps");
		demoSevenHttpResponse.setMaps(maps);
	 
	 	return demoSevenHttpResponse;
	}
}