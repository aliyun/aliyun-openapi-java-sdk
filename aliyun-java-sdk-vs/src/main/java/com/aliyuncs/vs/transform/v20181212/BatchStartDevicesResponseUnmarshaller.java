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

import com.aliyuncs.vs.model.v20181212.BatchStartDevicesResponse;
import com.aliyuncs.vs.model.v20181212.BatchStartDevicesResponse.Result;
import com.aliyuncs.vs.model.v20181212.BatchStartDevicesResponse.Result.Stream;
import com.aliyuncs.transform.UnmarshallerContext;


public class BatchStartDevicesResponseUnmarshaller {

	public static BatchStartDevicesResponse unmarshall(BatchStartDevicesResponse batchStartDevicesResponse, UnmarshallerContext _ctx) {
		
		batchStartDevicesResponse.setRequestId(_ctx.stringValue("BatchStartDevicesResponse.RequestId"));

		List<Result> results = new ArrayList<Result>();
		for (int i = 0; i < _ctx.lengthValue("BatchStartDevicesResponse.Results.Length"); i++) {
			Result result = new Result();
			result.setId(_ctx.stringValue("BatchStartDevicesResponse.Results["+ i +"].Id"));

			List<Stream> streams = new ArrayList<Stream>();
			for (int j = 0; j < _ctx.lengthValue("BatchStartDevicesResponse.Results["+ i +"].Streams.Length"); j++) {
				Stream stream = new Stream();
				stream.setId(_ctx.stringValue("BatchStartDevicesResponse.Results["+ i +"].Streams["+ j +"].Id"));
				stream.setName(_ctx.stringValue("BatchStartDevicesResponse.Results["+ i +"].Streams["+ j +"].Name"));
				stream.setError(_ctx.stringValue("BatchStartDevicesResponse.Results["+ i +"].Streams["+ j +"].Error"));

				streams.add(stream);
			}
			result.setStreams(streams);

			results.add(result);
		}
		batchStartDevicesResponse.setResults(results);
	 
	 	return batchStartDevicesResponse;
	}
}