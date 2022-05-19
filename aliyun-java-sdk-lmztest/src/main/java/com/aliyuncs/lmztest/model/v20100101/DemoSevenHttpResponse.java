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

package com.aliyuncs.lmztest.model.v20100101;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.lmztest.transform.v20100101.DemoSevenHttpResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DemoSevenHttpResponse extends AcsResponse {

	private String id;

	private String name;

	private String code;

	private List<Long> longList;

	private List<String> stringList;

	private List<Map<Object,Object>> maps;

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<Long> getLongList() {
		return this.longList;
	}

	public void setLongList(List<Long> longList) {
		this.longList = longList;
	}

	public List<String> getStringList() {
		return this.stringList;
	}

	public void setStringList(List<String> stringList) {
		this.stringList = stringList;
	}

	public List<Map<Object,Object>> getMaps() {
		return this.maps;
	}

	public void setMaps(List<Map<Object,Object>> maps) {
		this.maps = maps;
	}

	@Override
	public DemoSevenHttpResponse getInstance(UnmarshallerContext context) {
		return	DemoSevenHttpResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
