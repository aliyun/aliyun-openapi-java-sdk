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

import com.aliyuncs.vs.model.v20181212.DescribePresetsResponse;
import com.aliyuncs.vs.model.v20181212.DescribePresetsResponse.Preset;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribePresetsResponseUnmarshaller {

	public static DescribePresetsResponse unmarshall(DescribePresetsResponse describePresetsResponse, UnmarshallerContext _ctx) {
		
		describePresetsResponse.setRequestId(_ctx.stringValue("DescribePresetsResponse.RequestId"));
		describePresetsResponse.setId(_ctx.stringValue("DescribePresetsResponse.Id"));

		List<Preset> presets = new ArrayList<Preset>();
		for (int i = 0; i < _ctx.lengthValue("DescribePresetsResponse.Presets.Length"); i++) {
			Preset preset = new Preset();
			preset.setId(_ctx.stringValue("DescribePresetsResponse.Presets["+ i +"].Id"));
			preset.setName(_ctx.stringValue("DescribePresetsResponse.Presets["+ i +"].Name"));

			presets.add(preset);
		}
		describePresetsResponse.setPresets(presets);
	 
	 	return describePresetsResponse;
	}
}