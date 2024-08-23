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

package com.aliyuncs.governance.transform.v20210120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.governance.model.v20210120.ListAccountFactoryBaselinesResponse;
import com.aliyuncs.governance.model.v20210120.ListAccountFactoryBaselinesResponse.Baseline;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAccountFactoryBaselinesResponseUnmarshaller {

	public static ListAccountFactoryBaselinesResponse unmarshall(ListAccountFactoryBaselinesResponse listAccountFactoryBaselinesResponse, UnmarshallerContext _ctx) {
		
		listAccountFactoryBaselinesResponse.setRequestId(_ctx.stringValue("ListAccountFactoryBaselinesResponse.RequestId"));
		listAccountFactoryBaselinesResponse.setNextToken(_ctx.stringValue("ListAccountFactoryBaselinesResponse.NextToken"));

		List<Baseline> baselines = new ArrayList<Baseline>();
		for (int i = 0; i < _ctx.lengthValue("ListAccountFactoryBaselinesResponse.Baselines.Length"); i++) {
			Baseline baseline = new Baseline();
			baseline.setBaselineId(_ctx.stringValue("ListAccountFactoryBaselinesResponse.Baselines["+ i +"].BaselineId"));
			baseline.setBaselineName(_ctx.stringValue("ListAccountFactoryBaselinesResponse.Baselines["+ i +"].BaselineName"));
			baseline.setCreateTime(_ctx.stringValue("ListAccountFactoryBaselinesResponse.Baselines["+ i +"].CreateTime"));
			baseline.setDescription(_ctx.stringValue("ListAccountFactoryBaselinesResponse.Baselines["+ i +"].Description"));
			baseline.setType(_ctx.stringValue("ListAccountFactoryBaselinesResponse.Baselines["+ i +"].Type"));
			baseline.setUpdateTime(_ctx.stringValue("ListAccountFactoryBaselinesResponse.Baselines["+ i +"].UpdateTime"));

			baselines.add(baseline);
		}
		listAccountFactoryBaselinesResponse.setBaselines(baselines);
	 
	 	return listAccountFactoryBaselinesResponse;
	}
}