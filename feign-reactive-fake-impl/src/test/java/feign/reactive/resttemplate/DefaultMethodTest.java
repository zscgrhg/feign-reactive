/**
 * Copyright 2018 The Feign Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package feign.reactive.resttemplate;

import feign.reactive.ReactiveFeign;
import feign.reactive.ReactiveOptions;
import feign.reactive.resttemplate.client.RestTemplateFakeReactiveFeign;
import feign.reactive.testcase.IcecreamServiceApi;

/**
 * @author Sergii Karpenko
 */
public class DefaultMethodTest extends feign.reactive.DefaultMethodTest {

  @Override
  protected ReactiveFeign.Builder<IcecreamServiceApi> builder() {
    return RestTemplateFakeReactiveFeign.builder();
  }

  @Override
  protected <API> ReactiveFeign.Builder<API> builder(Class<API> apiClass) {
    return RestTemplateFakeReactiveFeign.builder();
  }

  @Override
  protected ReactiveFeign.Builder<IcecreamServiceApi> builder(ReactiveOptions options) {
    return RestTemplateFakeReactiveFeign.builder(options);
  }
}
