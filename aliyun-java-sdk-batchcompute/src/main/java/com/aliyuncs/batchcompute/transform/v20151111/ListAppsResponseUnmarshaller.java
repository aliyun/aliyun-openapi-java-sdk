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
package com.aliyuncs.batchcompute.transform.v20151111;

import com.aliyuncs.batchcompute.model.v20151111.ListAppsResponse;
import com.aliyuncs.batchcompute.pojo.v20151111.App;
import com.aliyuncs.batchcompute.pojo.v20151111.MarkableResult;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.HttpResponse;
import com.aliyuncs.transform.UnmarshallerContext;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import java.io.IOException;


public class ListAppsResponseUnmarshaller {

	public static ListAppsResponse unmarshall(ListAppsResponse listAppsResponse, UnmarshallerContext context) throws ServerException {
		HttpResponse httpResponse = context.getHttpResponse();
		listAppsResponse.setHttpResponse(httpResponse);

		try {
			String body = new String(httpResponse.getHttpContent(), httpResponse.getEncoding());
			setContent(body, listAppsResponse);
		} catch (IOException e) {
			throw new ServerException("API.EncodeError", "encode response body error", listAppsResponse.getRequestId());
		}

		return listAppsResponse;
	}
	private static void setContent(String body, ListAppsResponse listAppsResponse) throws IOException {
		ObjectMapper mapper = new ObjectMapper();

		MarkableResult<App> result = mapper.readValue(body,
				new TypeReference<MarkableResult<App>>() {
				});

		listAppsResponse.setItems(result.getItems());
		listAppsResponse.setNextMarker(result.getNextMarker());
	}
}