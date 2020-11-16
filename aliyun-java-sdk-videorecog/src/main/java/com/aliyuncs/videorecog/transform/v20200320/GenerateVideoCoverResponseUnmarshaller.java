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

package com.aliyuncs.videorecog.transform.v20200320;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.videorecog.model.v20200320.GenerateVideoCoverResponse;
import com.aliyuncs.videorecog.model.v20200320.GenerateVideoCoverResponse.Data;
import com.aliyuncs.videorecog.model.v20200320.GenerateVideoCoverResponse.Data.Output;
import com.aliyuncs.transform.UnmarshallerContext;


public class GenerateVideoCoverResponseUnmarshaller {

	public static GenerateVideoCoverResponse unmarshall(GenerateVideoCoverResponse generateVideoCoverResponse, UnmarshallerContext _ctx) {
		
		generateVideoCoverResponse.setRequestId(_ctx.stringValue("GenerateVideoCoverResponse.RequestId"));

		Data data = new Data();

		List<Output> outputs = new ArrayList<Output>();
		for (int i = 0; i < _ctx.lengthValue("GenerateVideoCoverResponse.Data.Outputs.Length"); i++) {
			Output output = new Output();
			output.setImageURL(_ctx.stringValue("GenerateVideoCoverResponse.Data.Outputs["+ i +"].ImageURL"));
			output.setConfidence(_ctx.floatValue("GenerateVideoCoverResponse.Data.Outputs["+ i +"].Confidence"));

			outputs.add(output);
		}
		data.setOutputs(outputs);
		generateVideoCoverResponse.setData(data);
	 
	 	return generateVideoCoverResponse;
	}
}