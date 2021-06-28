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

package com.aliyuncs.ecd.transform.v20200930;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecd.model.v20200930.RebuildDesktopsResponse;
import com.aliyuncs.ecd.model.v20200930.RebuildDesktopsResponse.RebuildResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class RebuildDesktopsResponseUnmarshaller {

	public static RebuildDesktopsResponse unmarshall(RebuildDesktopsResponse rebuildDesktopsResponse, UnmarshallerContext _ctx) {
		
		rebuildDesktopsResponse.setRequestId(_ctx.stringValue("RebuildDesktopsResponse.RequestId"));

		List<RebuildResult> rebuildResults = new ArrayList<RebuildResult>();
		for (int i = 0; i < _ctx.lengthValue("RebuildDesktopsResponse.RebuildResults.Length"); i++) {
			RebuildResult rebuildResult = new RebuildResult();
			rebuildResult.setDesktopId(_ctx.stringValue("RebuildDesktopsResponse.RebuildResults["+ i +"].DesktopId"));
			rebuildResult.setCode(_ctx.stringValue("RebuildDesktopsResponse.RebuildResults["+ i +"].Code"));
			rebuildResult.setMessage(_ctx.stringValue("RebuildDesktopsResponse.RebuildResults["+ i +"].Message"));

			rebuildResults.add(rebuildResult);
		}
		rebuildDesktopsResponse.setRebuildResults(rebuildResults);
	 
	 	return rebuildDesktopsResponse;
	}
}